package solutionShared;
     
import solutionShared.FileHandler;
import solutionShared.Login;

public class Login {
    
    protected String userId, userPassword, userRole;

    public Login(String userId, String userPassword, String userRole) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userRole = userRole;
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
    
 

    
}
