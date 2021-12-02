package HelperClasses;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailGenerator {
    
    public static void sendEmail(String recepient, String msg) throws MessagingException {
        System.out.println("Preparing to send enmail!");
        Properties properties = new Properties();

        //always require username and password to authenticate the account
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "slleeyifoo@gmail.com";
        String password = "f3WB7BCTQsYN";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recepient, msg);

        Transport.send(message);
        System.out.println("Message send successfully!");
    }
    
    public static Message prepareMessage(Session session, String myAccountEmail, String recepient, String msg) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Vaccination Appointment");
            message.setText(msg);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(EmailGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
