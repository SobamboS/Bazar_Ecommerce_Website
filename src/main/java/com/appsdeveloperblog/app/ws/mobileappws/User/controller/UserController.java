package com.appsdeveloperblog.app.ws.mobileappws.User.controller;

import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.response.DeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.response.LoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.response.UpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.response.UserResponse;
import com.appsdeveloperblog.app.ws.mobileappws.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{
    @Autowired
    private UserService userService;



    @PostMapping("/registerUser")
    public ResponseEntity<UserResponse> createUser(@RequestBody RegistrationRequest registrationRequest){
        try{
            UserResponse userResponse = userService.createUser(registrationRequest);
       return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
        }catch (RuntimeException e){
            UserResponse userResponse = new UserResponse();
            userResponse.setMessage(e.getMessage());
            userResponse.setStatusCode(401);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userResponse);
        }
    }
    @GetMapping("/userLogin")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(userService.login(loginRequest));
    }


    @PutMapping("/userUpdate")
    public ResponseEntity<UpdateResponse> update(@RequestBody UpdateRequest updateRequest){
        return ResponseEntity.ok(userService.update(updateRequest));
    }
    @DeleteMapping("/userDelete/{id}")
    public  ResponseEntity<DeleteResponse> delete(@PathVariable String id){
        return ResponseEntity.ok(userService.delete(id));
 }
}
