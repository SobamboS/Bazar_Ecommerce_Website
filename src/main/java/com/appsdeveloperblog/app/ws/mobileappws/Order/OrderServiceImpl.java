package com.appsdeveloperblog.app.ws.mobileappws.Order;


import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request.UpdateOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public String createOrder(CreateOrderRequest createOrderRequest){
        Order order = new Order();
      //  order.setProductName(createOrderRequest.getProductName());
        return null;
    }

    @Override
    public String updateOrder(UpdateOrderRequest updateOrderRequest){
        return null;
    }

    @Override
    public String deleteOrder(String id){
        return null;
    }

    @Override
    public Order findOrder(String orderId){
        var order = orderRepository.findByOrderId(orderId);
        if(order.toString().equals(orderId)) {
            throw new RuntimeException(String.format("%s not found",order));
        }
            return order;
    }

    @Override
    public String deleteAllOrder( ){
        return null;
    }

    @Override
    public void showAllOrder( ){

    }
}
