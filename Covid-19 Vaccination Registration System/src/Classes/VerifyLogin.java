package Classes;
     
import HelperClasses.FileHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
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
            String fileName = "peoplecredentials.txt";
            File readcredentials = FileHandler.retrievePath("Credentials", fileName);
        
            Scanner scan = new Scanner(readcredentials);
            
            for (int i = 0; i < readcredentials.length(); i++) 
            {
                if (credentials.userId.equals(scan.nextLine())) 
                {
                    if (credentials.userPassword.equals(scan.nextLine()))
                    {
                        System.out.println(credentials.userId);
                    }        
                }
            }
            scan.close();
            } catch (FileNotFoundException e) 
            {
                System.out.println("File Not Found.");
                e.printStackTrace();
            }
    };
    
}
