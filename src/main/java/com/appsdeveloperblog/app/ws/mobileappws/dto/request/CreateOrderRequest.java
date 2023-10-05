package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
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
