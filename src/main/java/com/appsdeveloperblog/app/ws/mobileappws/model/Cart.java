package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal cartTotal;

//    @OneToMany(mappedBy = "cart")
//    private List<CartItem> cartItems;

    @OneToOne(mappedBy = "cart")
    private User user;

}
