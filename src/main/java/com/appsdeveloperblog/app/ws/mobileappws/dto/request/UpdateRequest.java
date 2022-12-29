package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UpdateRequest{
     @Id
    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
