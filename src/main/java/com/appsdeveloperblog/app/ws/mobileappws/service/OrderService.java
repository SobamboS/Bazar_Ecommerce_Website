package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Order;


public interface OrderService{

    String  createOrder (CreateOrderRequest createOrderRequest);
    String  updateOrder (UpdateOrderRequest updateOrderRequest);
    String deleteOrder (String orderId);
    Order findOrder(String orderId);
    String deleteAllOrder ();
    void showAllOrder();
}