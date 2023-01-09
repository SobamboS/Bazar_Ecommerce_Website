package com.appsdeveloperblog.app.ws.mobileappws.Vendor.controller;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.VendorDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.VendorLoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.VendorRegistrationResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.VendorUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.exception.VendorRegistrationException;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor") // http://localhost:8080/vendor
public class VendorController{
    @Autowired
    private VendorService vendorService;
    @PostMapping("/registerVendor")
    public ResponseEntity<VendorRegistrationResponse> createVendor(@RequestBody VendorRegistrationRequest vendorRegistrationRequest){
        try {
            VendorRegistrationResponse vendorRegistrationResponse = vendorService.createVendor(vendorRegistrationRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(vendorRegistrationResponse);
        }catch (VendorRegistrationException exception){
            VendorRegistrationResponse vendorRegistrationResponse = new VendorRegistrationResponse(401,exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vendorRegistrationResponse);
        }
    }

    @GetMapping("/loginVendor")
    public ResponseEntity<VendorLoginResponse> vendorLogin (@RequestBody VendorLoginRequest vendorLoginRequest){
        return  ResponseEntity.ok(vendorService.vendorLogin(vendorLoginRequest));
    }

    @PatchMapping("/updateVendorDetails")
    public ResponseEntity<VendorUpdateResponse> vendorUpdate(@RequestBody VendorUpdateRequest vendorUpdateRequest){
        return ResponseEntity.ok(vendorService.vendorUpdate(vendorUpdateRequest));
    }

    @DeleteMapping("/deleteVendor/{id}")
    public  ResponseEntity<VendorDeleteResponse> vendorDelete(@PathVariable String id){
        return ResponseEntity.ok(vendorService.vendorDelete(id));
    }


}
