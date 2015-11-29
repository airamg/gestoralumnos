package com.ipartek.formacion.service.util;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public final class EnviarEmail {
  
  public boolean enviarEmail(String email) {
    boolean enviado = false;
    Properties props = new Properties();
    props.setProperty("mail.smtp.host", "smtp.gmail.com");
    props.setProperty("mail.smtp.port", "587");
    props.setProperty("mail.smtp.user", "algo@gmail.com");
    props.setProperty("mail.smtp.auth", "true"); //aqui iria la password de nuestro mail de arriba
    
    Session session = Session.getDefaultInstance(props);
    session.setDebug(true);
    
    MimeMessage mensaje = null;
    try {
      mensaje = new MimeMessage(session);
      mensaje.setFrom(new InternetAddress("algo@gmail.com"));
      mensaje.addRecipient(RecipientType.TO, new InternetAddress("otroalgo@gmail.com"));
      mensaje.setText("Hola");
      mensaje.setDescription("Saludo");
      
      Transport t = session.getTransport("smtp");
      t.connect("algo@gmail.com", "pass00");
      t.sendMessage(mensaje, mensaje.getAllRecipients());
      t.close();
      
      enviado = true;
      
    } catch (AddressException e) {
      e.printStackTrace();
      enviado = false;
    } catch (MessagingException e) {
      e.printStackTrace();
      enviado = false;
    }
    
    return enviado;
  }

}
