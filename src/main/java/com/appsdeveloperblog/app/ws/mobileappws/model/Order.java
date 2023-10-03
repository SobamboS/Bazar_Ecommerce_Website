package com.appsdeveloperblog.app.ws.mobileappws.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
@Data
@Document
public class Order{
    @Id
    private String orderId;
    @DBRef
    private User user;
    private BigDecimal orderTotal;
    private Boolean orderStatus = false;
    private List<Product> orderItem;
    private int orderQuantity;
}