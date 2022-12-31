package com.appsdeveloperblog.app.ws.mobileappws.service.OrderImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.OrderRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.CreateOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.DeleteAllOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.DeleteOrderResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Order.response.UpdateOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest){
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
