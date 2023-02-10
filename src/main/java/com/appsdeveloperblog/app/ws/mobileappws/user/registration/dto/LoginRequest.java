package com.appsdeveloperblog.app.ws.mobileappws.user.registration.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class LoginRequest{
    @Email(message="Input a valid email")
    private String emailAddress;

    @Pattern(regexp="^([a-zA-Z\\d@*#$&!]{8,15})$")
    private String password;
}