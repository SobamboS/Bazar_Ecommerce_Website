package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.Order.Order;
import com.appsdeveloperblog.app.ws.mobileappws.Payment.Payment;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import jakarta.mail.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User{
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String password;

    private Boolean isVerified = false;
    private Address address;
    @DBRef
    private Cart cart;
    @DBRef
    private Order order;
    private Payment payment;
   private Product product;



    public User(String firstName,String lastName,String emailAddress, String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        this.password=password;
    }
}
