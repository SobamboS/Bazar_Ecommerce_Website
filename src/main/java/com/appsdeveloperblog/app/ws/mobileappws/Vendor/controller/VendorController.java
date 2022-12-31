package com.appsdeveloperblog.app.ws.mobileappws.Vendor.controller;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.ResponseAndRequest.response.VendorRegistrationResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.exception.VendorRegistrationException;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VendorController{
    @Autowired
    private VendorService vendorService;
    @PostMapping("/registerVendor")
    public ResponseEntity<VendorRegistrationResponse> createVendor(@RequestBody VendorRegistrationRequest vendorRegistrationRequest){
        try {
            VendorRegistrationResponse vendorRegistrationResponse = vendorService.createVendor(vendorRegistrationRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(vendorRegistrationResponse);
        }catch (VendorRegistrationException exception){
            VendorRegistrationResponse vendorRegistrationResponse = new VendorRegistrationResponse();
            vendorRegistrationResponse.setMessage(exception.getMessage());
            vendorRegistrationResponse.setStatusCode(401);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vendorRegistrationResponse);
        }
    }

    @GetMapping("/loginVendor")
    public ResponseEntity<?> vendorLogin (@RequestBody VendorLoginRequest vendorLoginRequest){
        return  ResponseEntity.ok(vendorService.vendorLogin(vendorLoginRequest));
    }

    @PatchMapping("/updateVendorDetails")
    public ResponseEntity<?> vendorUpdate(@RequestBody VendorUpdateRequest vendorUpdateRequest){
        return ResponseEntity.ok(vendorService.vendorUpdate(vendorUpdateRequest));
    }

    @DeleteMapping("/deleteVendor/{id}")
    public  ResponseEntity<?> vendorDelete(@PathVariable String id){
        return ResponseEntity.ok(vendorService.vendorDelete(id));
    }


}
