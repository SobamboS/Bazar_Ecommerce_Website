package com.appsdeveloperblog.app.ws.mobileappws.Admin;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;

import java.util.List;
import java.util.Optional;

public interface AdminServices{
    String uploadProduct(UploadProductRequest uploadProductRequest);
    List<Product>findProductByName(String productName);
    Optional<User> findUserByID(String id);
    String updateAccount(UpdateAdminRequest updateAdminRequest);
}
