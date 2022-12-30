package com.appsdeveloperblog.app.ws.mobileappws;

import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorDeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorLoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorRegistrationResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.service.VendotImplementation.VendorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class VendorServiceImplTest{
    @Autowired
    private VendorService vendorService;

    private VendorRegistrationRequest vendorRegistrationRequest;

    @BeforeEach
    void setUp( ){
        vendorRegistrationRequest = new VendorRegistrationRequest();
        vendorRegistrationRequest.setEmail("Olusola@gmail.com");
        vendorRegistrationRequest.setPassword("eleven112@");
        vendorRegistrationRequest.setFirstName("Olusola");
        vendorRegistrationRequest.setLastName("Sobambo");
    }

    @Test
    void canCreateVendor( ){
        VendorRegistrationResponse response = vendorService.createVendor(vendorRegistrationRequest);
        assertNotNull(response);
        System.out.println(response);
        assertEquals("Registration Successful", response.getMessage());

    }
    @Test
    void canLoginVendor(){
        VendorLoginRequest vendorLoginRequest =new VendorLoginRequest();
        vendorLoginRequest.setEmail("Olusola@gmail.com");
        vendorLoginRequest.setPassword("eleven112@");
        VendorLoginResponse vendorLoginResponse = vendorService.vendorLogin(vendorLoginRequest);
        System.out.println(vendorLoginResponse);
        assertEquals("Login Successful", vendorLoginResponse.getMessage());

    }
    @Test
    void canUpdateVendor(){
        VendorUpdateRequest vendorUpdateRequest = new VendorUpdateRequest();
        vendorUpdateRequest.setId("63ae4f8a1747d719d27aa4ac");
        vendorUpdateRequest.setEmail("felix@gmail.com");
        VendorUpdateResponse vendorUpdateResponse = vendorService.vendorUpdate(vendorUpdateRequest);
        System.out.println(vendorUpdateResponse);
        assertEquals("Update Successful", vendorUpdateResponse.getMessage());
    }
    @Test
    void canDeleteVendor(){
        VendorDeleteRequest vendorDeleteRequest = new VendorDeleteRequest();
        vendorDeleteRequest.setId("63ae4f8a1747d719d27aa4ac");
        vendorDeleteRequest.setEmail("felix@gmail.com");
        VendorDeleteResponse vendorDeleteResponse = vendorService.vendorDelete(vendorDeleteRequest);
        System.out.println(vendorDeleteResponse);
        assertEquals("Deleted", vendorDeleteResponse.getMessage());
    }
}