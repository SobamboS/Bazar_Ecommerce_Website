package com.appsdeveloperblog.app.ws.mobileappws.controller;


import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.VendorDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.VendorLoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.VendorUpdateResponse;

import com.appsdeveloperblog.app.ws.mobileappws.service.VendorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*") // http://localhost:8080/vendor
public class VendorController{
    @Autowired
    private VendorService vendorService;
//    @PostMapping("/register_Vendor")
//    public VendorRegistrationResponse createVendor(@RequestBody @Valid VendorRegistrationRequest vendorRegistrationRequest){
//        return vendorService.createVendor(vendorRegistrationRequest);
//    }

    @GetMapping("/login_Vendor")
    public VendorLoginResponse vendorLogin (@RequestBody @Valid VendorLoginRequest vendorLoginRequest){
        return  vendorService.vendorLogin(vendorLoginRequest);
    }

    @PatchMapping("/updateVendorDetails")
    public VendorUpdateResponse vendorUpdate(@RequestBody @Valid VendorUpdateRequest vendorUpdateRequest){
        return vendorService.vendorUpdate(vendorUpdateRequest);
    }

    @DeleteMapping("/deleteVendor/{id}")
    public VendorDeleteResponse vendorDelete(@PathVariable String id){
        return vendorService.vendorDelete(id);
    }


}
