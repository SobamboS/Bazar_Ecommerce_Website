package com.appsdeveloperblog.app.ws.mobileappws.user.email;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.jar.JarEntry;

public class EmailService implements EmailSender{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void send(String to,String from) throws MessagingException{

    }
}
