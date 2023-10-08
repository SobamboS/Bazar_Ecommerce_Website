package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResendOtpRequest{
    @Email(message="Please input a valid email")
    private String email;
}
