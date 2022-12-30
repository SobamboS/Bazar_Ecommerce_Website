package com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request;

import jakarta.persistence.Id;
import lombok.Data;

    @Data
public class VendorDeleteRequest{
        @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
