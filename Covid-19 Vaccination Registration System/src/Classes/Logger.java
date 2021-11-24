/*
 * Not sure why it doesn't works....
 */

package Classes;
import HelperClasses.FileHandler;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Eric
 */

public class Logger {

    public static void writeLog() {
    
        String fileName = "logactivity.txt";
        File myFile = FileHandler.retrievePath("LogActivity", fileName);
    
        try ( FileWriter fw = new FileWriter(myFile, true);  BufferedWriter bw = new BufferedWriter(fw);) {
            LocalDate date = LocalDate.now();
            String datestring = date.format(DateTimeFormatter.ISO_DATE);
            LocalTime time = LocalTime.now();
            String timestring = time.format(DateTimeFormatter.ISO_TIME);
            bw.write(datestring);
            bw.write(timestring);
            bw.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}


