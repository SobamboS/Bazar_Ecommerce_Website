package com.appsdeveloperblog.app.ws.mobileappws.user.registration;

import com.appsdeveloperblog.app.ws.mobileappws.user.registration.dto.*;
import jakarta.mail.MessagingException;

public interface RegistrationService{
    SignupResponse signup(SignupRequest signupRequest) throws MessagingException;

    String login(LoginRequest loginRequest);

    String tokenConfirmation(TokenConfirmationRequest confirmationRequest);

    String resendToken(ResendTokenRequest resendTokenRequest) throws MessagingException;
}
