package com.appsdeveloperblog.app.ws.mobileappws.Cart.model;

import com.appsdeveloperblog.app.ws.mobileappws.Product.model.Product;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart{
    @Id
    private String id;
    private double total;
    private List<Product> cartProducts = new ArrayList<>();

}
