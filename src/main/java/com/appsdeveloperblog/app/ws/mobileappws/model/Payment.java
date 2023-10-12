package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.Enum.PaymentType;
import jakarta.persistence.*;
import org.apache.catalina.User;


import java.math.BigDecimal;
@Entity
public class Payment{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private PaymentType paymentType;
    private BigDecimal paymentTotal;
    private String userEmail;

    @OneToOne(mappedBy = "payment")
    Cart cart;

    private Boolean paymentStatus=false;

    @ManyToOne
    private User user;
}
