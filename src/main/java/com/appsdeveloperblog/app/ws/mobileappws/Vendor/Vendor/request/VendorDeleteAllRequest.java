package com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class VendorDeleteAllRequest{
    @Id
    private String id;
}
