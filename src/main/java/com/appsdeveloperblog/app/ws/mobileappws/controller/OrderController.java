package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.service.OrderService;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.CreateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateOrderRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired
    OrderService orderservice;

    @PostMapping("/createOrder")
    public ResponseEntity<?> createOder(@RequestBody @Valid CreateOrderRequest createOrderRequest,
                                 HttpServletRequest httpServletRequest){
    ApiResponse apiResponse = ApiResponse.builder()
            .status(HttpStatus.OK.value())
            .isSuccessful(true)
            .path(httpServletRequest.getRequestURI())
            .timeStamp(ZonedDateTime.now())
            .data(orderservice.createOrder(createOrderRequest))
            .build();
    return new ResponseEntity<>(apiResponse, HttpStatus.OK);
}
    @PostMapping("/updateOrder")
    public ResponseEntity<?> updateOrder(@RequestBody @Valid UpdateOrderRequest updateOrderRequest,
                                        HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(orderservice.updateOrder(updateOrderRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/deleteOrder")
    public ResponseEntity<?> deleteOrder(@RequestBody @Valid String orderId,
                                        HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(orderservice.deleteOrder(orderId))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

//    @PostMapping("/deleteAllOrder")
//    public ResponseEntity<?> deleteAllOrder(@RequestBody @Valid String,
//                                        HttpServletRequest httpServletRequest){
//        ApiResponse apiResponse = ApiResponse.builder()
//                .status(HttpStatus.OK.value())
//                .isSuccessful(true)
//                .path(httpServletRequest.getRequestURI())
//                .timeStamp(ZonedDateTime.now())
//                .data(orderservice.deleteAllOrder())
//                .build();
//        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
//    }

}
