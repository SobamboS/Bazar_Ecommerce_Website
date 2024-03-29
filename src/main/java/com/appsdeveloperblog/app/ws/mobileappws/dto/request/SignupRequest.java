package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

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

    @NotBlank
    @Email(message="Input a valid email")
    private String emailAddress;

    @NotBlank
    @Pattern(regexp="^([a-zA-Z\\d@*#$&!]{8,15})$")
    private String password;

    @Pattern(regexp="^([a-zA-Z\\d@*#$&!]{8,15})$", message="Password doesn't match")
    private String confirmPassword;
}
