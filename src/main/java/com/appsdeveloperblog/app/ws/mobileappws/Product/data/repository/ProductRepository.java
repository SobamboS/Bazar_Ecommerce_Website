package com.appsdeveloperblog.app.ws.mobileappws.Product.data.repository;

import com.appsdeveloperblog.app.ws.mobileappws.Product.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    Optional <Product> findById(String id);

}
