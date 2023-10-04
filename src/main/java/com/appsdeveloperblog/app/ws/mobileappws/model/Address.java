package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.*;


@Entity
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String buildingNo;
    private String street;
    private String locality;
    private String city;
    private String state;

    @OneToOne(mappedBy="address")
    private User user;

    

}
