package com.appsdeveloperblog.app.ws.mobileappws.dto.request;


import lombok.Data;



@Data
public class VendorUpdateRequest{

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
