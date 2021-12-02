package HelperClasses;

import java.io.IOException;
import org.apache.log4j.*;


public class Logging {
    static final Logger log = Logger.getLogger(Logging.class);
    static final FileAppender fileAppender = new FileAppender();
    static final String PATTERN = "%d [%p|%c|%C{1}] %m%n"; // date, [priority, category, class name (without package name)], message, new line
    
    public static void loginLog(String userId, String userType) throws SecurityException, IOException {
        String fileDirectory = "src/Database/LogFile" + System.getProperty("file.separator") + userType + System.getProperty("file.separator") + userId + ".txt";
        
        fileAppender.setFile(fileDirectory);
        fileAppender.setLayout(new PatternLayout(PATTERN));
        fileAppender.setThreshold(Level.INFO);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
    
        log.info(userType + "Login. (" + userType + "Id: " +userId+ ")");
    }

    public static void logoutLog(String userId, String userType) {
        String fileDirectory = "src/Database/LogFile" + System.getProperty("file.separator") + userType + System.getProperty("file.separator") + userId + ".txt";
        
        fileAppender.setFile(fileDirectory);
        fileAppender.setLayout(new PatternLayout(PATTERN));
        fileAppender.setThreshold(Level.INFO);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
    
        log.info(userType + "Logout. (" + userType + "Id: " +userId+ ")");
    }
}
