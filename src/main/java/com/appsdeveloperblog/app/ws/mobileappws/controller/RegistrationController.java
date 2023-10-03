package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.exception.ApiResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.ResendTokenRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.SignupRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.TokenConfirmationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.service.RegistrationService;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("registration")
public class RegistrationController{

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody @Valid SignupRequest signupRequest,
                                    HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(registrationService.signup(signupRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/confirm-token")
    public ResponseEntity<?> tokenConfirmation(@RequestBody @Valid TokenConfirmationRequest tokenConfirmationRequest,
                                               HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(registrationService.tokenConfirmation(tokenConfirmationRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid LoginRequest loginRequest,
                                   HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(registrationService.login(loginRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @PostMapping("/resend-token")
    public ResponseEntity<?> resendToken(@RequestBody @Valid ResendTokenRequest resendTokenRequest,
                                         HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(registrationService.resendToken(resendTokenRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
