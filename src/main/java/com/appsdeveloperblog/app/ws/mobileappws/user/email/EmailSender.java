package com.appsdeveloperblog.app.ws.mobileappws.user.email;

import jakarta.mail.MessagingException;

public interface EmailSender{
    void send(String to, String from) throws MessagingException;
}
