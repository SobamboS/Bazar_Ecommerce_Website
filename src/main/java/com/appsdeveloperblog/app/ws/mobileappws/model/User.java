package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.model.Order;
import com.appsdeveloperblog.app.ws.mobileappws.model.Payment;
import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import jakarta.mail.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BUser")
@ToString
public class User{
    @Id
   private Long userId;
    private String firstName;
    private String lastName;
    private String email;

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


    public User(String firstName,String lastName,String email, String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }


}
