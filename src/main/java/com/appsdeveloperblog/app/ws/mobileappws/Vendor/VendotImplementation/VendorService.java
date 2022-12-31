package com.appsdeveloperblog.app.ws.mobileappws.Vendor.VendotImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.response.*;

public interface VendorService{
    VendorRegistrationResponse createVendor (VendorRegistrationRequest vendorRegistrationRequest);
    VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest);
    VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest);
    VendorDeleteResponse vendorDelete(String id);

    VendorDeleteAllResponse vendorDeleteAll(String id);
}
