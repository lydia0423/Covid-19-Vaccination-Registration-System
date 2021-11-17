/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutionShared;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class NewAccRegistration {
    
    protected String citizen, name, icpassport, contact, email, address, password, confirmpassword, dob;
    
    public NewAccRegistration(String citizen, String name, String icpassport, String contact, String email, String address, String password, String confirmpassword, String dob) {
        this.citizen = citizen;
        this.name = name;
        this.icpassport = icpassport;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.password = password;
        this.confirmpassword = confirmpassword;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getConfirmPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //Save New Registration into File
    public static void saveRegistration(NewAccRegistration register) {
        
        String fileName = "peoplecredentials.txt";

        File myFile = FileHandler.createFilePath("Credentials", fileName);
        try ( FileWriter fw = new FileWriter(myFile, true);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(register.getCitizen() + " | ");
            bw.write(register.getName() + " | ");
            bw.write(register.getIcpassport() + " | ");
            bw.write(register.getContact() + " | ");
            bw.write(register.getEmail() + " | ");
            bw.write(register.getAddress() + " | ");
            bw.write(register.getPassword() + " | ");
            bw.write(register.getConfirmPassword() + " | ");
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
