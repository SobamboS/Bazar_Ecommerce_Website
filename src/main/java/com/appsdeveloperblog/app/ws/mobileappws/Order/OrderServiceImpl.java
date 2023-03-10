package com.appsdeveloperblog.app.ws.mobileappws.Order;

import com.appsdeveloperblog.app.ws.mobileappws.Order.Order;
import com.appsdeveloperblog.app.ws.mobileappws.Order.OrderRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Order.OrderService;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.CreateOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteAllOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.DeleteOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.response.UpdateOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest){
        Order order = new Order();
        order.setProductName(createOrderRequest.getProductName());
        return null;
    }

    @Override
    public UpdateOrderResponse updateOrder(UpdateOrderRequest updateOrderRequest){
        return null;
    }

    @Override
    public DeleteOrderResponse deleteOrder(String id){
        return null;
    }

    @Override
    public DeleteAllOrderResponse deleteAllOrder( ){
        return null;
    }

    @Override
    public void showAllOrder( ){

    }
}
