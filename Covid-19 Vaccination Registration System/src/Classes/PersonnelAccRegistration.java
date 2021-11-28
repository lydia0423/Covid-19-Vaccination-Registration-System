package Classes;

import Classes.Registration;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import HelperClasses.FileHandler;
import HelperClasses.FileMethods;
import java.util.UUID;


public class PersonnelAccRegistration extends Registration implements FileMethods{
    
    private String personnelId, name, ic;
    
    public PersonnelAccRegistration(String email, String password, String personnelId, String name, String ic) {
        super(email, password);
        this.personnelId = personnelId;
        this.name = name;
        this.ic = ic;
    }

    public String getPerseonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    
    //Generate random combination of number and alphabet for personnel Id
    public static String generatePersonnelId(){
        String personnelId = "PNL" + UUID.randomUUID().toString();
        return personnelId;
    }
    
    //Save New Registration into File
    public static void saveRegistration(PersonnelAccRegistration personnelRegistration) {
        
        String fileName = personnelRegistration.setFileName() + ".txt";

        File myFile = FileHandler.createFilePath("Personnel", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(personnelRegistration.getPerseonnelId());
            bw.newLine();
            bw.write(personnelRegistration.getName());
            bw.newLine();
            bw.write(personnelRegistration.getIc());
            bw.newLine();
            bw.write(personnelRegistration.getEmail());
            bw.newLine();
            bw.write(personnelRegistration.getPassword());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save appointment. Please try again.", "Register Vaccination Appointment Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
    }

    @Override
    public String setFileName() {
        return personnelId;
    }

    @Override
    public String getFileName() {
        return "Personnel/" + personnelId + ".txt";
    }
}