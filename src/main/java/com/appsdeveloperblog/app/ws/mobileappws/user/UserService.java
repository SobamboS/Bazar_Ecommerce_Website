package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.user.dto.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.SignupRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.SignupResponse;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.TokenConfirmationRequest;
import jakarta.mail.MessagingException;

public interface UserService {
    SignupResponse signup(SignupRequest signupRequest) throws MessagingException;

    String login(LoginRequest loginRequest);

    String tokenConfirmation(TokenConfirmationRequest confirmationRequest);
     void enableUser(String emailAddress);

}
