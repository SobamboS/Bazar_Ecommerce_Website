package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
@Entity
public class Order{
    @Id
    private Long id;


    private User user;

    private BigDecimal orderTotal;
    private Boolean orderStatus = false;
    private List<Product> orderItem;
    private int orderQuantity;
}
