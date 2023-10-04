package com.appsdeveloperblog.app.ws.mobileappws.model;

import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.model.Order;
import com.appsdeveloperblog.app.ws.mobileappws.model.Payment;
import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import jakarta.mail.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


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
    @Column(nullable = false, name = "Id")
    @SequenceGenerator(name = "seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="First_Name")
    private String firstName;
    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Email")
    @NotBlank(message = "This field is required")
    @Email(message = "Invalid email") // To validate email address
    @NaturalId
    private String email;

    @Column(name="Phone_Number")
    private String phoneNumber;
    @Column(name="Password")
    private String password;

    @Column(name="IsVerified")
    private Boolean isVerified = false;

    @Column(name="Address")
    private Address address;

    @Column(name="Cart")
    private Cart cart;

    @Column(name="Order")
    private Order order;

    @Column(name="Payment")
    private Payment payment;

    @Column(name="Product")
    private Product product;


    public User(String firstName,String lastName,String email, String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }


}
