package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.exception.ApiResponse;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.SignupRequest;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("api")
public class UserController{
    @Autowired
UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody @Valid SignupRequest signupRequest,HttpServletRequest httpServletRequest) throws MessagingException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(userService.signup(signupRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    }

