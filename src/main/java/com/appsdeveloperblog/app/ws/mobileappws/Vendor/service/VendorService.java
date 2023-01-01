package com.appsdeveloperblog.app.ws.mobileappws.Vendor.service;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.response.*;

public interface VendorService{
    VendorRegistrationResponse createVendor (VendorRegistrationRequest vendorRegistrationRequest);
    VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    VendorDeleteResponse vendorDelete(String id);

    VendorDeleteAllResponse vendorDeleteAll();
}
