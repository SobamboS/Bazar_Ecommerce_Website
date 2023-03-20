package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>{

    Optional<Cart> findByCartId(String cartId);
    Optional<Cart> findCartByUserId(User user);
    void addProducts(Product product);
}
