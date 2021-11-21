package Classes;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import HelperClasses.FileHandler;
import HelperClasses.FileHandler;
import HelperClasses.FileMethods;

public class VaccinationAppointment implements FileMethods{

    protected String appointmentId, patientName, patientIdentification, state, vaccinationCenter, vaccineType, registeredDate, appointmentDate, appointmentTime, healthCondition, closeContact, appointmentStatus;

    public VaccinationAppointment(String appointmentId, String patientName, String patientIdentification, String state, String vaccinationCenter, String vaccineType, String registeredDate, String appointmentDate, String appointmentTime, String healthCondition, String closeContact, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientIdentification = patientIdentification;
        this.state = state;
        this.vaccinationCenter = vaccinationCenter;
        this.vaccineType = vaccineType;
        this.registeredDate = registeredDate;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.healthCondition = healthCondition;
        this.closeContact = closeContact;
        this.appointmentStatus = appointmentStatus;
    }
   
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientId) {
        this.patientName = patientId;
    }

    public String getPatientIdentification() {
        return patientIdentification;
    }

    public void setPatientIdentification(String patientIdentification) {
        this.patientIdentification = patientIdentification;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(String vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getCloseContact() {
        return closeContact;
    }

    public void setCloseContact(String closeContact) {
        this.closeContact = closeContact;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
    
    

    //Generate random combination of number and alphabet for appointment Id
    public static String generateAppointmentId() {
        String appointmentId = "APT_" + UUID.randomUUID().toString();
        return appointmentId;
    }

    //Retrieve all appointments made
    public static ArrayList<VaccinationAppointment> getAllVaccinationAppointments() {
        //Retrive from folder
        File appointmentFolder = FileHandler.retrievePath("Appointment", "null");
        File[] appointmentFiles = appointmentFolder.listFiles();
        ArrayList<VaccinationAppointment> allAppointments = new ArrayList<>();
        for (File appointmentFile : appointmentFiles) {
            try ( Scanner readFile = new Scanner(appointmentFile)) {
                while (readFile.hasNext()) {
                    allAppointments.add(new VaccinationAppointment(
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine()
                    ));
                }
            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        }
        return allAppointments;
    }
    
    //Retrieve specific appointment
    public static VaccinationAppointment getVaccinationAppointment(String fileName) {
        //Retrieve from folder
        File appointmentFile = FileHandler.retrievePath("Appointment", fileName);
       
        try ( Scanner readFile = new Scanner(appointmentFile)) {
            while (readFile.hasNext()) {
                VaccinationAppointment appointment = new VaccinationAppointment(
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine()
                );
                return appointment;
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        return null;
    }

    //Save Appointment
    public static void saveAppointment(VaccinationAppointment appointment) {
        String fileName = appointment.setFileName() + ".txt";

        File myFile = FileHandler.createFilePath("Appointment", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(appointment.getAppointmentId());
            bw.newLine();
            bw.write(appointment.getPatientName());
            bw.newLine();
            bw.write(appointment.getPatientIdentification());
            bw.newLine();
            bw.write(appointment.getState());
            bw.newLine();
            bw.write(appointment.getVaccinationCenter());
            bw.newLine();
            bw.write(appointment.getVaccineType());
            bw.newLine();
            bw.write(appointment.getRegisteredDate());
            bw.newLine();
            bw.write(appointment.getAppointmentDate());
            bw.newLine();
            bw.write(appointment.getAppointmentTime());
            bw.newLine();
            bw.write(appointment.getHealthCondition());
            bw.newLine();
            bw.write(appointment.getCloseContact());
            bw.newLine();
            bw.write(appointment.getAppointmentStatus());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save appointment. Please try again.", "Register Vaccination Appointment Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }

        JOptionPane.showMessageDialog(null, "Vaccination Appointment successfully saved.", "Register Vaccination Appointment Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String setFileName() {
        return appointmentId;
    }
    
    @Override
    public String getFileName() {
        return "Appointment/" + appointmentId + ".txt";
    }
}
