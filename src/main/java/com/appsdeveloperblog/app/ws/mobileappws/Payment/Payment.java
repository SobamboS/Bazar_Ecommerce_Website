package com.appsdeveloperblog.app.ws.mobileappws.Payment;

import jakarta.persistence.criteria.Order;

import java.math.BigDecimal;

public class Payment{
    private String id;
    private PaymentType paymentType;
    private BigDecimal total;
    private Order order;
    private Boolean paymentStatus = false;


}
