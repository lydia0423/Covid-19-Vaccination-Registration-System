package solutionShared;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import solutionShared.FileHandler;

public class VaccinationAppointment {

    protected String appointmentId, patientName, patientIdentification, vaccinationCenter, vaccineType, registeredDate, appointmentDate, appointmentTime, healthCondition, closeContact, appointmentStatus;

    public VaccinationAppointment(String appointmentId, String patientName, String patientIdentification, String vaccinationCenter, String vaccineType, String registeredDate, String appointmentDate, String appointmentTime, String healthCondition, String closeContact, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientIdentification = patientIdentification;
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
    
    

    //Generate appointment ID
    public static String generateAppointmentId() {
        ArrayList<String> existingAppointmentId = new ArrayList<>();
        String prefix = "A0";

        //Check if the booking id has already been used, regenerate id if in use
        String[] appointmentFolder = FileHandler.retrievePath("Appointment", "null").list();
        for (String appointmentFolderFiles : appointmentFolder) {
            try ( Scanner readFiles = new Scanner(appointmentFolderFiles)) {
                while (readFiles.hasNext()) {
                    String[] fileName = readFiles.nextLine().split(Pattern.quote("."));
                    existingAppointmentId.add(fileName[0]);
                }
            } catch (Exception e) {
                System.err.println("Error retrieving files: " + e);
            }
        }
        //Get the last used ID and increment by 1
        int lastIndex = existingAppointmentId.size() - 1;
        String idChar = existingAppointmentId.get(lastIndex);
        String[] idNum = idChar.split("A");

        int lastId = Integer.valueOf(idNum[1]);//Integer.parseInt(idNum[1]);
        int appointmentNum = lastId + 1;
        if (appointmentNum < 10) {
            prefix = "A000";
        } else if (appointmentNum < 100) {
            prefix = "A00";
        }
        if (existingAppointmentId.isEmpty()) {
            appointmentNum = 1;
        }
        String appointmentId = prefix + appointmentNum;

        for (String id : existingAppointmentId) {
            while (appointmentId.equals(id)) {
                appointmentNum++;
                appointmentId = prefix + appointmentNum;
            }
        }
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
        String fileName = appointment.appointmentId + ".txt";

        File myFile = FileHandler.createFilePath("Appointment", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(appointment.getAppointmentId());
            bw.newLine();
            bw.write(appointment.getPatientName());
            bw.newLine();
            bw.write(appointment.getPatientIdentification());
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
}
