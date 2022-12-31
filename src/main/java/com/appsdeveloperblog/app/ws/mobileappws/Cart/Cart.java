package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
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
