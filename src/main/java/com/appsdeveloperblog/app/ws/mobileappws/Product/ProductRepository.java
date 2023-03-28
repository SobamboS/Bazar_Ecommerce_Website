package com.appsdeveloperblog.app.ws.mobileappws.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    Optional <Product> findByProductId(String productId);
    List<Product> findByProductName(String productName);
}
