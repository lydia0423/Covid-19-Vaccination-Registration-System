package Classes;

import PersonnelGUI.PersonnelMainMenu;
import PeopleGUI.PeopleMainMenu;
import HelperClasses.EncryptAndDecrypt;
import HelperClasses.Logging;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginVerification{

    protected String userName, userPassword, userRole;

    public LoginVerification(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public static void verifyLogin(String userName, String password, JFrame jframe) throws SecurityException, IOException {
        ArrayList<PersonnelAccRegistration> allPersonnelAccounts = new ArrayList<>();
        ArrayList<PeopleAccRegistration> allPeopleAccounts = new ArrayList<>();
        
        if(userName.contains("helpacquire.com")){
            allPersonnelAccounts = PersonnelAccRegistration.getAllPersonnelAccounts();
            
            for(PersonnelAccRegistration account : allPersonnelAccounts){
                String decoderPassword = EncryptAndDecrypt.decryptPassword(account.getPassword());
                if(userName.equals(account.getEmail()) && password.equals(decoderPassword)){
                    new PersonnelMainMenu(account.getName(), account.getPersonnelId()).setVisible(true);
                    jframe.dispose();
                    Logging.loginLog(account.getPersonnelId(), "Personnel");
                }           
            }
            
        }else{
            allPeopleAccounts = PeopleAccRegistration.getAllPeopleAccounts();
            
            for(PeopleAccRegistration account : allPeopleAccounts){
                String decoderPassword = EncryptAndDecrypt.decryptPassword(account.getPassword());
                if(userName.equals(account.getEmail()) && password.equals(decoderPassword)){
                    new PeopleMainMenu(account.getName(), account.getPeopleId(), account.getIcOrPassport()).setVisible(true);
                    jframe.dispose();
                    Logging.loginLog(account.getPeopleId(), "People");
                }
            } 
        }
    }
    
    public static void updatePassword(String userName, String password){
        ArrayList<PersonnelAccRegistration> allPersonnelAccounts = new ArrayList<>();
        ArrayList<PeopleAccRegistration> allPeopleAccounts = new ArrayList<>();
        
        String userId, name, icOrPassport, dob, contact, address, citizen;
        
        if(userName.contains("helpacquire.com")){
            allPersonnelAccounts = PersonnelAccRegistration.getAllPersonnelAccounts();
            
            for(PersonnelAccRegistration account : allPersonnelAccounts){
                if(userName.equals(account.getEmail())){
                    userId = account.getPersonnelId();
                    name = account.getName();
                    icOrPassport = account.getIc();
                    userName = account.getEmail();
                    
                    PersonnelAccRegistration updatePassword = new PersonnelAccRegistration(userId, name, icOrPassport, userName, password);
                    PersonnelAccRegistration.savePersonnelRegistration(updatePassword, "update");
                    
                    JOptionPane.showMessageDialog(null, "Password successfully saved.", "Update Password Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }       
        }else{
            allPeopleAccounts = PeopleAccRegistration.getAllPeopleAccounts();
            
            for(PeopleAccRegistration account : allPeopleAccounts){
                if(userName.equals(account.getEmail())){
                    userId = account.getPeopleId();
                    name = account.getName();
                    icOrPassport = account.getIcOrPassport();
                    dob = account.getDob();
                    contact = account.getContact();
                    address = account.getAddress();
                    citizen = account.getCitizen();
                    userName = account.getEmail();
                    
                    PeopleAccRegistration updatePassword = new PeopleAccRegistration(userId, name, icOrPassport, dob, contact, address, citizen, userName, password);
                    PeopleAccRegistration.saveRegistration(updatePassword, "update"); 
                    
                    JOptionPane.showMessageDialog(null, "Password successfully saved.", "Update Password Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
    }



}
