package com.appsdeveloperblog.app.ws.mobileappws.Repository;


import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>{

   Cart findByCartId(String cartId);
}
