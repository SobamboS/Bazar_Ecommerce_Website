package com.appsdeveloperblog.app.ws.mobileappws.Vendor.data.model;


import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Vendor{
    @Id
    private String id;
   // @NotBlank()
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
}
