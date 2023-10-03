package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.*;

public interface VendorService{
    VendorRegistrationResponse vendorRegister (VendorRegistrationRequest vendorRegistrationRequest);
    VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    VendorDeleteResponse vendorDelete(String id);

}
