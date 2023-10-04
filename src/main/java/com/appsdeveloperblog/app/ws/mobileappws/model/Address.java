package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity

public class Address{
    @Id
    private Long addressId;
    private String buildingNo;
    private String street;
    private String locality;
    private String city;
    private String state;

    private User user;

    

}
