package com.appsdeveloperblog.app.ws.mobileappws.Order.model;

import com.appsdeveloperblog.app.ws.mobileappws.Product.model.Product;
import jakarta.persistence.Id;
import jdk.jfr.Category;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Order{
    @Id
    private String id;
    private String userId;
    private double total;
    private List<Product> productList = new ArrayList<>();
    private Category category;
    private String productName;
    private int quantity;
}
