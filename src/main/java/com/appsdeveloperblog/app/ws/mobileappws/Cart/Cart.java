package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.CartItem.CartItem;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import jakarta.persistence.Id;
import lombok.Data;
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
