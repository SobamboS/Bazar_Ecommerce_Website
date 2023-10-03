//package com.appsdeveloperblog.app.ws.mobileappws;
//
//import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.VendorLoginRequest;
//import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.VendorRegistrationRequest;
//import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.VendorUpdateRequest;
//import com.appsdeveloperblog.app.ws.mobileappws.Repository.VendorRepository;
//import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.*;
//import com.appsdeveloperblog.app.ws.mobileappws.service.VendorService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class VendorServiceImplTest{
//    @Autowired
//    private VendorService vendorService;
//    @Autowired
//    private VendorRepository vendorRepository;
//@Autowired
//    private VendorRegistrationRequest vendorRegistrationRequest;
//
//    private VendorUpdateRequest vendorUpdateRequest;
//
//    @BeforeEach
//    void setUp( ){
//        vendorRegistrationRequest = new VendorRegistrationRequest();
//        vendorRegistrationRequest.setEmail("Olusola@gmail.com");
//        vendorRegistrationRequest.setPassword("O1@aholaer");
//        vendorRegistrationRequest.setPassword("olusola11");
//        vendorRegistrationRequest.setFirstName("Olusola");
//        vendorRegistrationRequest.setLastName("Sobambo");
//        vendorRegistrationRequest.setPhoneNumber("08144357336");
//    }
//
////    @Test
////    void canCreateVendor( ){
////        VendorRegistrationResponse response = vendorService.createVendor(vendorRegistrationRequest);
////        assertNotNull(response);
////        System.out.println(response);
////        assertEquals("Registration Successful", response.getMessage());
////
////    }
//    @Test
//    void canLoginVendor(){
//        VendorLoginRequest vendorLoginRequest =new VendorLoginRequest();
//        vendorLoginRequest.setEmail("Olusola@gmail.com");
//        vendorLoginRequest.setPassword("eleven112@");
//        VendorLoginResponse vendorLoginResponse = vendorService.vendorLogin(vendorLoginRequest);
//        System.out.println(vendorLoginResponse);
//        assertEquals("Login Successful", vendorLoginResponse.getMessage());
//
//    }
//    @Test
//    void canUpdateVendor(){
//        VendorUpdateRequest vendorUpdateRequest = new VendorUpdateRequest();
//        vendorUpdateRequest.setId("63b8c169b1d1ce636aa77b1d");
//        vendorUpdateRequest.setEmail("felix@gmail.com");
//        VendorUpdateResponse vendorUpdateResponse = vendorService.vendorUpdate(vendorUpdateRequest);
//        System.out.println(vendorUpdateResponse);
//        assertEquals("Updated Successful", vendorUpdateResponse.getMessage());
//    }
//    @Test
//    void canDeleteVendor(){
//        VendorDeleteResponse vendorDeleteResponse = vendorService.vendorDelete("63b8c169b1d1ce636aa77b1d");
//        System.out.println(vendorDeleteResponse);
//        assertEquals("Vendor Deleted", vendorDeleteResponse.getMessage());
//    }
//
////    @Test
////    void canDeleteAllVendor(){
////        VendorDeleteAllResponse vendorDeleteAllResponse = vendorService.vendorDeleteAll();
////        System.out.println(vendorDeleteAllResponse);
////        assertEquals("All vendors deleted ", vendorDeleteAllResponse.getMessage());
////    }
//}