package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class VendorRegistrationRequest{
    @NotBlank(message="Field is required")
    @Size(max=20)
    private String firstName;

    @NotBlank(message="Field is required")
    @Size(max=20)
    private String lastName;

    @Email(message="input a valid email")
    private String email;

    @Pattern(regexp="[a-zA-Z\\d(@#$!_)]{5,20}")
    private String password;

    @Pattern(regexp="^\\d+$")
    @Size(max=11, min=11, message="Enter a valid number")
    public String phoneNumber;


}

