package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {
    @Id
    private String id;
    private int statusCode;
    private String message;
}
