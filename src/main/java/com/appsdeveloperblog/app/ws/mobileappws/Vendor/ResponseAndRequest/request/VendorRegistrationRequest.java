package com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request;

import lombok.Data;

@Data
public class VendorRegistrationRequest{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    public String phoneNumber;


}
