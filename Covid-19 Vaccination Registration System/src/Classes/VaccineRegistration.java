package Classes;

import HelperClasses.FileHandler;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import javax.swing.JOptionPane;
import HelperClasses.FileMethods;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class VaccineRegistration implements FileMethods{
    
    protected String registrationId, name, icpassport, contact, email, closecontact, healthcondition, state, preferredcentre;
    
    public VaccineRegistration(String registrationId, String name, String icpassport, String contact, String email, 
                        String closecontact, String healthcondition, String state, String preferredcentre) {
        this.registrationId = registrationId;
        this.name = name;
        this.icpassport = icpassport;
        this.contact = contact;
        this.email = email;
        this.closecontact = closecontact;
        this.healthcondition = healthcondition;
        this.state = state;
        this.preferredcentre = preferredcentre;
    }
    
    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIcPassport() {
        return icpassport;
    }

    public void setIcPassport(String icpassport) {
        this.icpassport = icpassport;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCloseContact() {
        return closecontact;
    }

    public void setCloseContact(String closecontact) {
        this.closecontact = closecontact;
    }
    
    public String getHealthCondition() {
        return healthcondition;
    }

    public void setHealthCondition(String healthcondition) {
        this.healthcondition = healthcondition;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getPreferredCentre() {
        return preferredcentre;
    }

    public void setPreferredCentre(String preferredcentre) {
        this.preferredcentre = preferredcentre;
    }
    
    
    //Generate random combination of number and alphabet for registration Id
    public static String generateRegistrationId() {
        String registrationId = "RGS_" + UUID.randomUUID().toString();
        return registrationId;
    }
    
     //Save Registration
    public static void saveRegistration(VaccineRegistration registervaccine) {
        String fileName = registervaccine.setFileName() + ".txt";

        File myFile = FileHandler.createFilePath("Registration", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(registervaccine.getName());
            bw.newLine();
            bw.write(registervaccine.getIcPassport());
            bw.newLine();
            bw.write(registervaccine.getContact());
            bw.newLine();
            bw.write(registervaccine.getEmail());
            bw.newLine();
            bw.write(registervaccine.getCloseContact());
            bw.newLine();
            bw.write(registervaccine.getHealthCondition());
            bw.newLine();
            bw.write(registervaccine.getState());
            bw.newLine();
            bw.write(registervaccine.getPreferredCentre());
            bw.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Vaccination Program Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }

        JOptionPane.showMessageDialog(null, "Successful Registration to Vaccination Program!", "Register Vaccination Program Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String setFileName() {
        return registrationId;
    }
    
    @Override
    public String getFileName() {
        return "Registration/" + registrationId + ".txt";
    }
    
    
    //Retrieve specific registration
    public static VaccineRegistration getVaccineRegistration() {
        
        //Retrieve from folder
        File registrationFile = FileHandler.retrievePath("Registration", "");
       
        try ( Scanner readFile = new Scanner(registrationFile)) {
            while (readFile.hasNext()) {
                VaccineRegistration registration = new VaccineRegistration(
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
                
                return registration;
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        return null;
    }
}
