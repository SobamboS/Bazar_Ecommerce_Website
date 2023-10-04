package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.Enum.PaymentType;
import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Entity
public class Payment{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentId;
    private PaymentType paymentType;
    private BigDecimal paymentTotal;
    private String userEmail;

    @OneToOne(mappedBy = "payment")
    Cart cart;

    private Boolean paymentStatus=false;

    @ManyToOne
    private User user;
}
