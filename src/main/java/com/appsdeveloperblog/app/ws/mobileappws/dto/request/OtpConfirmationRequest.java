package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class OtpConfirmationRequest{

    @Email(message="Input a valid email address")
    private String email;

    @Pattern(regexp="^\\d+$")
    private String otp;
}
