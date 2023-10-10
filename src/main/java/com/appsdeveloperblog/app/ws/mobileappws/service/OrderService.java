package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService{

    String  createOrder (CreateOrderRequest createOrderRequest);
    String  updateOrder (UpdateOrderRequest updateOrderRequest);
    String deleteOrder (String orderId);
    Order findOrder(String orderId);
    String deleteAllOrder ();
    void showAllOrder();
}
