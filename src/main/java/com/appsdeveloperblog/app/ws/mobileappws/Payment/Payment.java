package com.appsdeveloperblog.app.ws.mobileappws.Payment;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.Cart;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.Order;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@Document
public class Payment{
    @Id
    private String paymentId;
    private PaymentType paymentType;
    private BigDecimal paymentTotal;

    @DBRef
    Cart cart;

    private Boolean paymentStatus=false;

    @DBRef
    private User user;
}
