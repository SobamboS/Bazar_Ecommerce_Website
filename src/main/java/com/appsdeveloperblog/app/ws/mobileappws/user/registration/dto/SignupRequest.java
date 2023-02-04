package com.appsdeveloperblog.app.ws.mobileappws.user.registration.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignupRequest{
    @NotBlank(message="Field is required")
    @Size(max=20)
    private String firstName;

    @NotBlank(message="Field is required")
    @Size(max=20)
    private String lastName;

    @Email(message="Input a valid email")
    private String emailAddress;

    @Pattern(regexp="^[a-z][A-Z]\\d[@$#!%*_?&][A-Za-z\\d@$#!%*_?&]{5,20}$")
    private String password;
}
