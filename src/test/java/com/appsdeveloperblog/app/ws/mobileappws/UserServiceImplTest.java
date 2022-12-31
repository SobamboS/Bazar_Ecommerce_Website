package com.appsdeveloperblog.app.ws.mobileappws;

import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response.*;

import com.appsdeveloperblog.app.ws.mobileappws.User.service.UserService;

import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.LoginRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    private RegistrationRequest registrationRequest;

    @BeforeEach
    void setUp( ){
        registrationRequest = new RegistrationRequest();
        registrationRequest.setEmail("shola@gmail.com");
        registrationRequest.setFirstName("David");
        registrationRequest.setLastName("Halland");
        registrationRequest.setPassword("Qwertyuo@13");
    }

    @Test
    void userCanRegister() {
        UserResponse response = userService.createUser(registrationRequest);
        assertNotNull(response);
        System.out.println(response);
        assertEquals("Registration successful", response.getMessage());
    }

    @Test
    void thatUserCanLogin() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail("shola@gmail.com");
        loginRequest.setPassword("Qwertyuo@13");
        LoginResponse loginResponse = userService.login(loginRequest);
        System.out.println(loginResponse);
        assertEquals("Login is successful", loginResponse.getMessage());
    }

    @Test
    void canUpdateUser(){
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.setId("63aec937cae85f4d8694f2a4");
        updateRequest.setEmail("Femi@gmail.com");
        UpdateResponse updateResponse = userService.update(updateRequest);
        System.out.println(updateResponse);
        assertEquals("User info updated", updateResponse.getMessage());
    }


    @Test
    void canDeleteUser(){
       DeleteResponse deleteResponse = userService.delete("63aec937cae85f4d8694f2a4");
        System.out.println(deleteResponse);
        assertEquals("User Deleted", deleteResponse.getMessage());
    }
    @Test
    void canDeleteAll(){
        DeleteAllResponse deleteAllResponse = userService.deleteAll("");
        System.out.println(deleteAllResponse);
        assertEquals("All user Deleted", deleteAllResponse.getMessage());
    }


}