package com.appsdeveloperblog.app.ws.mobileappws.service.VendotImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.VendorRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorDeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorLoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorRegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.request.VendorUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorLoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorRegistrationResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Vendor.response.VendorUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.models.Vendor;
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
    public VendorDeleteResponse vendorDelete(VendorDeleteRequest vendorDeleteRequest){
Vendor deleteVendor = vendorRepository.findById(vendorDeleteRequest.getId())
        .orElseThrow(()-> new RuntimeException("Sorry couldn't delete"));
VendorDeleteResponse vendorDeleteResponse = new VendorDeleteResponse();

if(deleteVendor.getId().equals(vendorDeleteRequest.getId())){
    vendorRepository.delete(deleteVendor);
    vendorDeleteResponse.setMessage("Deleted");

    return vendorDeleteResponse;
}else
    vendorDeleteResponse.setMessage("Unsuccessful");
return vendorDeleteResponse;
    }
}
