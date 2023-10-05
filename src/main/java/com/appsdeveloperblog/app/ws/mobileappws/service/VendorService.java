package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.*;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorUpdateRequest;

public interface VendorService{
    VendorRegistrationResponse vendorRegister (VendorRegistrationRequest vendorRegistrationRequest);
    VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    VendorDeleteResponse vendorDelete(String id);

}
