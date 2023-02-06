package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.user.dto.SignupRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.SignupResponse;
import jakarta.mail.MessagingException;

public interface UserService {
    SignupResponse signup(SignupRequest signupRequest) throws MessagingException;
}
