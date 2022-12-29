package com.appsdeveloperblog.app.ws.mobileappws.service.implementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.DeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.LoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.UpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.UserResponse;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.DeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.LoginRequest;
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
        updateRequest.setId(1);
        UpdateResponse updateResponse = userService.update(updateRequest);
        assertEquals("Id found", updateResponse.getMessage());
    }

    @Test
    void canDeleteUser(){
        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.setId(52);
        deleteRequest.setEmail("Femi@gmail.com");
        DeleteResponse deleteResponse = userService.delete(deleteRequest);
        assertEquals("Deleted", deleteResponse.getMessage());

    }


}