package com.appsdeveloperblog.app.ws.mobileappws.Vendor.VendotImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.VendorRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor.response.*;
import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    private VendorRepository vendorRepository;


    @Override
    public VendorRegistrationResponse createVendor(VendorRegistrationRequest vendorRegistrationRequest){
        Vendor vendor = new Vendor();
        vendor.setEmail(vendorRegistrationRequest.getEmail());
        vendor.setFirstName(vendorRegistrationRequest.getFirstName());
        vendor.setLastName(vendorRegistrationRequest.getLastName());
        vendor.setPassword(vendorRegistrationRequest.getPassword());
        Vendor savedVendor = vendorRepository.save(vendor);
        VendorRegistrationResponse response = new VendorRegistrationResponse();
        response.setId(savedVendor.getId());
        response.setStatusCode(201);
        response.setMessage("Registration Successful");
        return response;
    }

    @Override
    public VendorLoginResponse vendorLogin(VendorLoginRequest vendorLoginRequest){
Vendor foundVendor = vendorRepository.findByEmail(vendorLoginRequest.getEmail())
        .orElseThrow(()-> new RuntimeException("Email not found"));
VendorLoginResponse vendorLoginResponse = new VendorLoginResponse();
if(foundVendor.getPassword().equals(vendorLoginRequest.getPassword())){
    vendorLoginResponse.setMessage("Login Successful");
    return  vendorLoginResponse;
    }else
        vendorLoginResponse.setMessage("Incorrect user details");
return vendorLoginResponse;
    }

    @Override
    public VendorUpdateResponse vendorUpdate(VendorUpdateRequest vendorUpdateRequest){
        Vendor updateVendor = vendorRepository.findById(vendorUpdateRequest.getId())
                .orElseThrow(()-> new RuntimeException("Id not found"));
        VendorUpdateResponse updateResponse = new VendorUpdateResponse();
        if(updateVendor.getId().equals(vendorUpdateRequest.getId())){
            updateVendor.setEmail(vendorUpdateRequest.getEmail());
            updateVendor.setLastName(vendorUpdateRequest.getLastName());
            updateVendor.setFirstName(vendorUpdateRequest.getFirstName());
            updateVendor.setPassword(updateVendor.getPassword());
            vendorRepository.save(updateVendor);
            updateResponse.setMessage("Update Successful");
            return updateResponse;
        }else
            updateResponse.setMessage("Update not done");
        return updateResponse;
    }


    @Override
    public VendorDeleteResponse vendorDelete(String id){
        vendorRepository.deleteById(id);
        return new VendorDeleteResponse("Vendor Deleted");
    }

    @Override
    public VendorDeleteAllResponse vendorDeleteAll(String id){
      vendorRepository.deleteAll();
    return  new VendorDeleteAllResponse("All vendors deleted ");

    }
}
