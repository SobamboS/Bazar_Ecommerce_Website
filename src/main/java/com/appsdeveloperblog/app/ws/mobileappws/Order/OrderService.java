package com.appsdeveloperblog.app.ws.mobileappws.Order;

import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.CreateOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteAllOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.UpdateOrderResponse;



public interface OrderService{

    String  createOrder (CreateOrderRequest createOrderRequest);
    String  updateOrder (UpdateOrderRequest updateOrderRequest);
    String deleteOrder (String id);
    String deleteAllOrder ();
    void showAllOrder();
}
