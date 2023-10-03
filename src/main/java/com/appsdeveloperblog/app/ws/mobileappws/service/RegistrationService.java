package com.appsdeveloperblog.app.ws.mobileappws.service;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.*;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService{
    SignupResponse signup(SignupRequest signupRequest) throws MessagingException;

    String login(LoginRequest loginRequest)throws MessagingException;

    String tokenConfirmation(TokenConfirmationRequest confirmationRequest)throws MessagingException;

    String resendToken(ResendTokenRequest resendTokenRequest) throws MessagingException;
    String updateAccount(UpdateAccountRequest updateAccountRequest);
}