package com.appsdeveloperblog.app.ws.mobileappws.Order.requestAndresponse.request;

import com.appsdeveloperblog.app.ws.mobileappws.Product.model.Product;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateOrderRequest{
    @Id
    private String id;
    private String userId;
    private double total;
    private List<Product> orderProducts = new ArrayList<>();
}