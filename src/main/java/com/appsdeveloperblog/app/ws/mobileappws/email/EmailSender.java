package com.appsdeveloperblog.app.ws.mobileappws.email;

import jakarta.mail.MessagingException;

public interface EmailSender{
    void send(String to, String email) throws MessagingException;
}
