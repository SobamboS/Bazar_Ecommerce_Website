package com.appsdeveloperblog.app.ws.mobileappws.User.User.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
