package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class TokenConfirmationRequest{
    @Email(message="Input a valid email address")
    private String emailAddress;
    @Pattern(regexp="^\\d+$")
    private String token;
}