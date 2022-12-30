package com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request;

import lombok.Data;

@Data
public class VendorRegistrationRequest{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
