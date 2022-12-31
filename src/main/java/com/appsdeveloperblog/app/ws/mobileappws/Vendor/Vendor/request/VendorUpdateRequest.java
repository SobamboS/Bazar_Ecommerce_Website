package com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class VendorUpdateRequest{
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
