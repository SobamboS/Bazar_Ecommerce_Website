package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
@Entity
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    private BigDecimal orderTotal;
    private Boolean orderStatus = false;

    @ManyToMany
    private List<Product> orderItem;
    private int orderQuantity;
}
