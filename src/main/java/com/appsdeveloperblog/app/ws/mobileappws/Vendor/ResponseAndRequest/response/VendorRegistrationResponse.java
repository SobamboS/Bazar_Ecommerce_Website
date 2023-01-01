package com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendorRegistrationResponse{
    private String id;
    private int statusCode;
    private String message;
}
