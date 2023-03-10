package com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateOrderRequest{
    private String userId;
    private double total;
    private List<Product> orderProducts = new ArrayList<>();
    private String productName;
}
