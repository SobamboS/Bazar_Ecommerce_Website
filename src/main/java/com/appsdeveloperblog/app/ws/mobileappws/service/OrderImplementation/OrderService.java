package com.appsdeveloperblog.app.ws.mobileappws.service.OrderImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.CreateOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.DeleteAllOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.DeleteOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.UpdateOrderResponse;

public interface OrderService{

    CreateOrderResponse createOrder (CreateOrderRequest createOrderRequest);
    UpdateOrderResponse updateOrder (UpdateOrderRequest updateOrderRequest);
    DeleteOrderResponse deleteOrder (String id);
    DeleteAllOrderResponse deleteAllOrder ();
    void showAllOrder();
}
