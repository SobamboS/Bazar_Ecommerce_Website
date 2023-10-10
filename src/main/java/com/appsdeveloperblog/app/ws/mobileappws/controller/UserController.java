package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.Instant;

@RestController
@RequestMapping("/user")
public class UserController{

   private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/verifyNumber")
    public ResponseEntity<?> verifyPhoneNumber(@RequestBody @Valid String phoneNumber,
                                   HttpServletRequest httpServletRequest)throws IOException{
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(userService.verifyPhoneNumber(phoneNumber))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }




    }

