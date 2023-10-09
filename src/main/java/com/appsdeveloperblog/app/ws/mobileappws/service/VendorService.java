package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.MessageResponse;

public interface VendorService{
    MessageResponse vendorRegister (VendorRegistrationRequest vendorRegistrationRequest);
    MessageResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    MessageResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    MessageResponse vendorDelete(String id);

}
