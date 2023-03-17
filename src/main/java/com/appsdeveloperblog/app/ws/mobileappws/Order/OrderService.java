package com.appsdeveloperblog.app.ws.mobileappws.Order;

import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.UpdateOrderRequest;



public interface OrderService{

    String  createOrder (CreateOrderRequest createOrderRequest);
    String  updateOrder (UpdateOrderRequest updateOrderRequest);
    String deleteOrder (String orderId);
    String deleteAllOrder ();
    void showAllOrder();
}
