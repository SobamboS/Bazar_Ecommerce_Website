package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ResendOtpRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.SignupRequest;
import com.appsdeveloperblog.app.ws.mobileappws.service.UnauthenticatedUserService;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.ZonedDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("registration")
public class RegistrationController{



   private final UnauthenticatedUserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody @Valid SignupRequest signupRequest,
                                    HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(userService.signup(signupRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

//    @PostMapping("/confirm-token")
//    public ResponseEntity<?> tokenConfirmation(@RequestBody @Valid OtpConfirmationRequest otpConfirmationRequest,
//                                               HttpServletRequest httpServletRequest) throws MessagingException{
//        ApiResponse apiResponse = ApiResponse.builder()
//                .status(HttpStatus.OK.value())
//                .isSuccessful(true)
//                .path(httpServletRequest.getRequestURI())
//                .timeStamp(Instant.now())
//                .data(userService.tokenConfirmation(otpConfirmationRequest))
//                .build();
//        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
//    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid LoginRequest loginRequest,
                                   HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(userService.login(loginRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @PostMapping("/resend-token")
    public ResponseEntity<?> resendToken(@RequestBody @Valid ResendOtpRequest resendOtpRequest,
                                         HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(userService.resendOtp(resendOtpRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
