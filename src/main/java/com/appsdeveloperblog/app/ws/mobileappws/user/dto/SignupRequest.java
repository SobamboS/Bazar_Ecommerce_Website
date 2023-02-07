package com.appsdeveloperblog.app.ws.mobileappws.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class SignupRequest{
    @NotBlank(message="Field is required")
    @Size(max=20)
    private String firstName;

    @NotBlank(message="Field is required")
    @Size(max=20)
    private String lastName;

    @Email(message="Input a valid email")
    private String emailAddress;

    @Pattern(regexp="^([a-zA-Z\\d@*#$&!]{8,15})$")
    private String password;

    private String confirmPassword;
}
