package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.FindProductRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
     void enableUser(String emailAddress);
String generateToken(User user);
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);
Product findProductByName(FindProductRequest findProductRequest);

}
