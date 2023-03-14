package com.appsdeveloperblog.app.ws.mobileappws.Admin;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Slf4j
public class AdminServicesImpl implements AdminServices{
    @Override
    public String uploadProduct(UploadProductRequest uploadProductRequest){
        return null;
    }

    @Override
    public List<Product> findProductByName(String productName){
        return null;
    }

    @Override
    public Optional<User> findUserByID(String id){
        return Optional.empty();
    }

    @Override
    public String updateAccount(UpdateAdminRequest updateAdminRequest){
        return null;
    }
}
