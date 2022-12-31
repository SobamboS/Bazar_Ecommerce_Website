package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, String>{
    Optional<Order> findById(String name);
}
