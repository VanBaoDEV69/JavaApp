
package controller;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 *
 * @author Văn Bảo
 */
public class IdentityGmailController {

    public void sendGmail(String to_gmail, int identity_code){
        final String username = "gg3developer@gmail.com";
        final String password = "jnafhebhpcifmuqk";
        
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587"); 
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(username, password);
                    }
                });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("gg3developer@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_gmail, false));
            message.setSubject("Mã xác thực tài khoản:");
            message.setText(identity_code+" là mã xác thực của bạn.");
            Transport.send(message);
            
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    
}