/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import static GUI.View.RESULT;

/**
 *
 * @author Muddassir Iqbal
 */
public class Email  extends javax.mail.Authenticator {
    String attachment;
    private String mailhost ="smtp.gmail.com";      //SMTP Host/Email for Gmail
    private String mailhost1 ="smtp.mail.yahoo.com";
    private String user="YOUR EMAIL ID ";                            //Gmail username
    private String password="PASSWORD";                        //Gmail Password
    private Session session;                        //To establish a session
    
    public Email() {
       
 
        // Create properties for Gmail server
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");   //Protocol
        props.setProperty("mail.smtp.host", mailhost);          //Host Name
        props.setProperty("mail.smtp.host", mailhost1);
        props.put("mail.smtp.auth", "true");                    //SMTP Authentication
        props.put("mail.smtp.port", "465");                     //SMTP port number
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory"); //SSL Socket setting
        props.put("mail.smtp.starttls.enable","true");          //Start TLS Authentication
        props.put("mail.smtp.debug", "true");                   //Debugging
        //props.put("mail.smtp.socketFactory.fallback", "false"); 
        //props.setProperty("mail.smtp.quitwait", "false");  
        //session=Session.getDefaultInstance(props, this);
        session = Session.getInstance(props, this);             //Get instance
        
    }
    
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(user, password);
    }
    
    public void sendMail(String recipients) throws Exception{
        Message message = new MimeMessage(session);
        String subject="Resume by Career Constructor";
        String body= "Kindly Download your Resume created by Career Constructor.\n\nWith Regards ";
        // Mail with Attachment
        String sender="careerconstructor@yahoo.com";
        message.setFrom(new InternetAddress(sender));     // Set From: header field of the header.
        message.setSubject(subject);                      // Set Subject: header field
        BodyPart messageBodyPart = new MimeBodyPart();    // Create the message part
        messageBodyPart.setContent(body, "text/html");    // Now set the actual message          
        Multipart multipart = new MimeMultipart();        // Create a multipart message          
        multipart.addBodyPart(messageBodyPart);           // Set text message part
        
        // Part two is attachment
        
            attachment = RESULT;
            messageBodyPart = new MimeBodyPart();             
            DataSource source = new FileDataSource(attachment);           
            messageBodyPart.setDataHandler(new DataHandler(source));
        
            // Extracting filename out of file path
            int i = attachment.lastIndexOf('\\');                         
            String file = attachment.substring(i+1);
            messageBodyPart.setFileName(file);
            multipart.addBodyPart(messageBodyPart);            
            message.setContent(multipart);            // Set the complete message parts
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));
        //Set the recepients
        Transport.send(message);                    // Sending mail
    }
}