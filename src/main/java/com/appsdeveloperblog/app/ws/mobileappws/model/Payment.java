package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.Enum.PaymentType;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
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
    private String userEmail;
    @DBRef
    Cart cart;

    private Boolean paymentStatus=false;

    @DBRef
    private User user;
}
