package com.appsdeveloperblog.app.ws.mobileappws.User.controller;

import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response.UserResponse;
import com.appsdeveloperblog.app.ws.mobileappws.User.service.UserService;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.response.VendorRegistrationResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.exception.VendorRegistrationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping()
    public String getUser(){
        return "Get user called";
    }


    @PostMapping("/registerUsers")
    public ResponseEntity<RegistrationRequest> createUser(@RequestBody RegistrationRequest registrationRequest){
        try{
            UserResponse userResponse = userService.createUser(registrationRequest);
       return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
        }catch (RuntimeException e){
            UserResponse userResponse = new UserResponse();
            userResponse.setMessage(e.getMessage());
            userResponse.setStatusCode(401);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(registrationRequest);
        }
    }


    @PutMapping
    public String updateUser(){
        return "Update user was called";
    }
    @DeleteMapping
    public  String deleteUser(){
         return " Delete user was called ";
 }
}
