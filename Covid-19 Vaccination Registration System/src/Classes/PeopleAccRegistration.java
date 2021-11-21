/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import HelperClasses.FileHandler;

/**
 *
 * @author Eric
 */
public class PeopleAccRegistration extends Register{
    
    protected String citizen, name, icpassport, contact, address, dob;
    
    public PeopleAccRegistration(String email, String password, String citizen, String name, String icpassport, String contact, String address, String dob) {
        super(email, password);
        this.citizen = citizen;
        this.name = name;
        this.icpassport = icpassport;
        this.contact = contact;
        this.address = address;
        this.dob = dob;
    }

    public String getCitizen() {
        return citizen;
    }
       
    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcpassport() {
        return icpassport;
    }

    public void setIcpassport(String icpassport) {
        this.icpassport = icpassport;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //Save New Registration into File
    public static void saveRegistration(PeopleAccRegistration register) {
        
        String fileName = "peoplecredentials.txt";

        File myFile = FileHandler.createFilePath("Credentials", fileName);
        try ( FileWriter fw = new FileWriter(myFile, true);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(register.getEmail() + "\n");
            bw.write(register.getPassword() + "\n");
            bw.write(register.getCitizen() + "\n");
            bw.write(register.getName() + "\n");
            bw.write(register.getIcpassport() + "\n");
            bw.write(register.getContact() + "\n");
            bw.write(register.getAddress() + "\n");
            bw.write(register.getDob() + "\n");
            bw.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Account Registration Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
            return;
        }

        JOptionPane.showMessageDialog(null, "Account registered successfully.", "Account Registration Success!", JOptionPane.INFORMATION_MESSAGE);
    }
}
