package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Address{
    @Id
    private String addressId;
    private String buildingNo;
    private String street;
    private String locality;
    private String city;
    private String state;
    @DBRef
    private User user;

    

}
