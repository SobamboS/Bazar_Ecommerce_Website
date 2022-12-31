package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response;

import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private int statusCode;
    private String message;
}
