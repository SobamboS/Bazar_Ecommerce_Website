package com.appsdeveloperblog.app.ws.mobileappws.Order;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Data
public class Order{
    @Id
    private String id;
    @DBRef
    private User user;
    private BigDecimal total;
    private Boolean orderStatus = false;
    private List<Product> orderItem;
    private int quantity;
}