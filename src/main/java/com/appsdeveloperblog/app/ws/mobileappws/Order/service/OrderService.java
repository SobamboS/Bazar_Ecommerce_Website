package com.appsdeveloperblog.app.ws.mobileappws.Order.service;

import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.CreateOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteAllOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.UpdateOrderResponse;

public interface OrderService{

    CreateOrderResponse createOrder (CreateOrderRequest createOrderRequest);
    UpdateOrderResponse updateOrder (UpdateOrderRequest updateOrderRequest);
    DeleteOrderResponse deleteOrder (String id);
    DeleteAllOrderResponse deleteAllOrder ();
    void showAllOrder();
}
