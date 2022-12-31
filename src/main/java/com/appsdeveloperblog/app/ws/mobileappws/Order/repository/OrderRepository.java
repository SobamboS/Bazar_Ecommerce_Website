package com.appsdeveloperblog.app.ws.mobileappws.Order.repository;

import com.appsdeveloperblog.app.ws.mobileappws.Order.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, String>{
    Optional<Order> findById(String name);
}
