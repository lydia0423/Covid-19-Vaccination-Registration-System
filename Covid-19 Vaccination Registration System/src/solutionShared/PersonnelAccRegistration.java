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
public class PersonnelAccRegistration extends Register{
    
    protected String id, name;
    
    public PersonnelAccRegistration(String email, String password, String id, String name) {
        super(email, password);
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Save New Registration into File
    public static void saveRegistration(PersonnelAccRegistration register) {
        
        String fileName = "personnelcredentials.txt";

        File myFile = FileHandler.createFilePath("Credentials", fileName);
        try ( FileWriter fw = new FileWriter(myFile, true);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(register.getEmail() + " | ");
            bw.write(register.getPassword() + " | ");
            bw.write(register.getId() + " | ");
            bw.write(register.getName() + " \n ");
            bw.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Account Registration Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
            return;
        }

        JOptionPane.showMessageDialog(null, "Account registered successfully.", "Account Registration Success!", JOptionPane.INFORMATION_MESSAGE);
    }
}
