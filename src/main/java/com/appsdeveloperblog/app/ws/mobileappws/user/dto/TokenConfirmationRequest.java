package com.appsdeveloperblog.app.ws.mobileappws.user.dto;

import lombok.Data;

@Data
public class TokenConfirmationRequest{
    private String emailAddress;
    private String token;
}
