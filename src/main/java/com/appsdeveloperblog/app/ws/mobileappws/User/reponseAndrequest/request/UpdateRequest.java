package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UpdateRequest{
     @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
