package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.Enum.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.apache.catalina.User;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Entity
public class Payment{

    @Id
    private String paymentId;
    private PaymentType paymentType;
    private BigDecimal paymentTotal;
    private String userEmail;

    Cart cart;

    private Boolean paymentStatus=false;

    private User user;
}
