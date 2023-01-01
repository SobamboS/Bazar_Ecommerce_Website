package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request;

import lombok.Data;


@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

}
