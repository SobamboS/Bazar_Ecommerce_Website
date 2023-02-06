package com.appsdeveloperblog.app.ws.mobileappws.Vendor.service;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.response.*;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.exception.VendorLoginException;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.exception.VendorUpdateException;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.data.repository.VendorRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.dto.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.data.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    private VendorRepository vendorRepository;




//    @Override
//    public VendorRegistrationResponse vendorRegister(VendorRegistrationRequest vendorRegistrationRequest){
//        boolean emailEmail = vendorRepository.findByEmail(vendorRegistrationRequest.getEmail());
//        Vendor vendor = new Vendor();
//        vendor.setEmail(vendorRegistrationRequest.getEmail());
//        vendor.setFirstName(vendorRegistrationRequest.getFirstName());
//        vendor.setLastName(vendorRegistrationRequest.getLastName());
//        vendor.setPhoneNumber(vendorRegistrationRequest.getPhoneNumber());
//        vendor.setPassword(vendorRegistrationRequest.getPassword());
//        vendorRepository.save(vendor);
//        return new VendorRegistrationResponse(201,"Registration Successful");
//    }

    @Override
    public VendorRegistrationResponse vendorRegister(VendorRegistrationRequest vendorRegistrationRequest){
        return null;
    }

    @Override
    public VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest){
    Vendor foundVendor = vendorRepository.findByEmail(vendorLoginRequest.getEmail())
        .orElseThrow(()-> new VendorLoginException("Email not found"));
    if(foundVendor.getPassword().equals(vendorLoginRequest.getPassword())){
       return new VendorLoginResponse("Login Successful") ;
    }else
       return new VendorLoginResponse("Incorrect login info");
    }

    @Override
    public VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest){
        Vendor updateVendor = vendorRepository.findById(vendorUpdateRequest.getId())
                .orElseThrow(()-> new VendorUpdateException("Id not found"));
        if(updateVendor.getId().equals(vendorUpdateRequest.getId())){
            vendorRepository.save(updateVendor);
            return new VendorUpdateResponse("Updated Successful");
        }else
         return new VendorUpdateResponse("Update not done");
    }


    @Override
    public VendorDeleteResponse vendorDelete(String id){
        boolean exists = vendorRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(String.format("Vendor with %s does not exist",id));
        }
        vendorRepository.deleteById(id);
        return new VendorDeleteResponse("Vendor Deleted");

    }
}
