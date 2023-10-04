package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;

import java.util.List;
@Setter
@Getter
@Entity
@Table(name="Cart")
public class Cart{

    @Id
    private Long id;

    private BigDecimal cartTotal;


    private List<CartItem> cartItems;

    User user;

}
