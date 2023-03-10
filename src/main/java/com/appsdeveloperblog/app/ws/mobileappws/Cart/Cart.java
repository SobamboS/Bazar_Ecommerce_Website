package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Cart{
    @Id
    private String id;
    private BigDecimal total;
    private List<Product> cartItem ;

}