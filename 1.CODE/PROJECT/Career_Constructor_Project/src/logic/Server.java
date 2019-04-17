/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author Muddassir Iqbal
 */
public class Server  extends javax.mail.Authenticator {
    String attachment;
    private String mailhost ="smtp.gmail.com";      //SMTP Host/Server for Gmail
    private String mailhost1 ="smtp.mail.yahoo.com";
    private String user;                            //Gmail username
    private String password;                        //Gmail Password
    private Session session;                        //To establish a session
    
    public Server(String user, String password) {
        this.user = user;
        this.password = password;  
 
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
    
    public void sendMail(String subject, String body, String sender, String recipients, String filename) throws Exception{
        Message message = new MimeMessage(session);
        
        // Mail with Attachment
        message.setFrom(new InternetAddress(sender));     // Set From: header field of the header.
        message.setSubject(subject);                      // Set Subject: header field
        BodyPart messageBodyPart = new MimeBodyPart();    // Create the message part
        messageBodyPart.setContent(body, "text/html");    // Now set the actual message          
        Multipart multipart = new MimeMultipart();        // Create a multipart message          
        multipart.addBodyPart(messageBodyPart);           // Set text message part
        
        // Part two is attachment
        if(!filename.equals("NULL")){
            attachment = filename;
            messageBodyPart = new MimeBodyPart();             
            DataSource source = new FileDataSource(attachment);           
            messageBodyPart.setDataHandler(new DataHandler(source));
        
            // Extracting filename out of file path
            int i = attachment.lastIndexOf('\\');                         
            String file = attachment.substring(i+1);
            messageBodyPart.setFileName(file);
            multipart.addBodyPart(messageBodyPart);            
            message.setContent(multipart);            // Set the complete message parts
        }
        //Set the recepients
        if (recipients.indexOf(',') > 0)
            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(recipients));
        else
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));
        
        Transport.send(message);                    // Sending mail
    }
}