package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
