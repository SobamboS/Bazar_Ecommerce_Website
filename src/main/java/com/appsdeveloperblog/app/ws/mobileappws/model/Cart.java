package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

import java.util.List;

@Data
@Entity
@Table(name="Cart")
public class Cart{
    @Id
    private long id;

    private BigDecimal cartTotal;
    @DBRef

    private List<CartItem> cartItems;

    @DBRef
    User user;

}
