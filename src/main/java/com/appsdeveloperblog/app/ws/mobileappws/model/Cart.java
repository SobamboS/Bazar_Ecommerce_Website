package com.appsdeveloperblog.app.ws.mobileappws.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

import java.util.List;

@Data
@Document
public class Cart{
    @Id
    private String cartId;
    private BigDecimal cartTotal;
    @DBRef
    private List<CartItem> cartItems;
    @DBRef
    User user;

}
