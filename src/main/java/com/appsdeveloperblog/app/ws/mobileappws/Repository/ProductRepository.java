package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByProductId(String productId);
    Product findByProductName(String productName);

}
