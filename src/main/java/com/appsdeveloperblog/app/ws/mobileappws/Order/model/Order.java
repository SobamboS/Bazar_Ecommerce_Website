package com.appsdeveloperblog.app.ws.mobileappws.Order.model;

import com.appsdeveloperblog.app.ws.mobileappws.Product.data.model.Product;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Order{
    @Id
    private String id;
    private String userId;
    private double price;
    private List<Product> productList = new ArrayList<>();
    private String productName;

    private int quantity;
}
