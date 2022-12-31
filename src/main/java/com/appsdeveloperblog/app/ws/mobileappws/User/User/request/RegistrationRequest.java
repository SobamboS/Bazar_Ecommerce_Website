package com.appsdeveloperblog.app.ws.mobileappws.User.User.request;

import lombok.Data;


@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
