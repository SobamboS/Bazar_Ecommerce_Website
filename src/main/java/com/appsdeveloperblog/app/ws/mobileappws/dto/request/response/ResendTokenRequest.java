package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class ResendTokenRequest{
    @Email(message="Please input a valid email")
    private String emailAddress;
}
