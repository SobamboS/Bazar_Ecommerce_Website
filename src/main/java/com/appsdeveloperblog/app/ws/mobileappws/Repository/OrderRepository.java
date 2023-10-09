package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
    Order findByOrderId(String orderId);
}
