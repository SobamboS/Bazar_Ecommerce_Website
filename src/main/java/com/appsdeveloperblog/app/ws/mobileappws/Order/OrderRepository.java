package com.appsdeveloperblog.app.ws.mobileappws.Order;

import com.appsdeveloperblog.app.ws.mobileappws.Order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, String>{
    Order findByOrderId(String orderId);
}
