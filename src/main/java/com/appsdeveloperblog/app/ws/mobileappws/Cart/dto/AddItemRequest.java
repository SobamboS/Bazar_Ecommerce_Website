package com.appsdeveloperblog.app.ws.mobileappws.Cart.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class AddItemRequest{
    private Product product;
    private int quantity;
    @DBRef
    private User user;
}
