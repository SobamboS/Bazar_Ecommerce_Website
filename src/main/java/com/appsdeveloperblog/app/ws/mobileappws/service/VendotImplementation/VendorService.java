package com.appsdeveloperblog.app.ws.mobileappws.service.VendotImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.*;

public interface VendorService{
    VendorRegistrationResponse createVendor (VendorRegistrationRequest vendorRegistrationRequest);
    VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    VendorDeleteResponse vendorDelete(String id);

    VendorDeleteAllResponse vendorDeleteAll(String id);
}
