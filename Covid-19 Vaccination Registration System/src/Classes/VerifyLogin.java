/**
 * Does not pop out dialog box when credentials is invalid.
 * 
 * Although successful login, the login page will still be there.
 * (How to make it disappear?)
 * 
 */




package Classes;
     
import HelperClasses.FileHandler;
import PersonnelGUI.PersonnelMainMenu;
import PeopleGUI.PeopleMainMenu;
import CommonGUI.Login;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException; 

public class VerifyLogin {
    
    protected String userId, userPassword, userRole;

    public VerifyLogin(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public static void setRole(VerifyLogin credentials) {
        
        try {
            
            // Set role as personnel if User Id contains "helpacquire.com"
            
            if ((credentials.userId).contains("helpacquire.com")) {
            
                String fileName = "personnelcredentials.txt";
                File readcredentials = FileHandler.retrievePath("Credentials", fileName);
        
                Scanner scan = new Scanner(readcredentials);
            
                while (readcredentials != null) {
                    String personnelrole = scan.nextLine();
                    String personnelid = scan.nextLine();
                    String personnelname = scan.nextLine();
                    String personnelemail = scan.nextLine();
                    String personnelpassword = scan.nextLine(); 

                    if (personnelemail.equals(credentials.userId) && personnelpassword.equals(credentials.userPassword)) {
                        credentials.userRole = "Personnel"; 
                        PersonnelMainMenu personnelmenu = new PersonnelMainMenu();
                        personnelmenu.setVisible(true);
                        Login login = new Login();
                        login.setVisible(false);                    
                    }
                }
            }
            
            // if it does not contain "helpacquire.com", then read credentials from people txt file
            else if (!(credentials.userId.contains("helpacquire.com"))){
                String fileName = "peoplecredentials.txt";
                File readcredentials = FileHandler.retrievePath("Credentials", fileName);
        
                Scanner scan = new Scanner(readcredentials);
                     
                while (readcredentials != null) {
                    String peoplerole = scan.nextLine();
                    String peoplenationality = scan.nextLine();
                    String peoplename = scan.nextLine();
                    String peopleidentification = scan.nextLine();
                    String peoplecontact = scan.nextLine(); 
                    String peopleladdress = scan.nextLine(); 
                    String peopledob = scan.nextLine(); 
                    String peopleemail = scan.nextLine(); 
                    String peoplepassword = scan.nextLine(); 
                    
                    if (peopleemail.equals(credentials.userId) && peoplepassword.equals(credentials.userPassword)) {
                        credentials.userRole = "People"; 
                        PeopleMainMenu peoplemenu = new PeopleMainMenu();
                        peoplemenu.setVisible(true);
                        Login login = new Login();
                        login.setVisible(false);                    
                    }
                } 
            }  
            // no matching email and password in personnel credential or people credential
            else {
                JOptionPane.showMessageDialog(null, "Invalid Credentials.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        catch (FileNotFoundException e) 
            {
                System.out.println("File Not Found.");
                e.printStackTrace();
            }

    };
    
}
