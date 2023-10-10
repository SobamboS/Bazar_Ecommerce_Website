package com.appsdeveloperblog.app.ws.mobileappws.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.Instant;
import java.util.List;


@Setter
@Getter
@Builder
@Entity
@Table(name = "BUser")
@ToString
public class User{

    @Id
    @Column(nullable = false, name = "Id")
    @SequenceGenerator(name = "seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="First_Name", length=50)
    @NotBlank(message="First name cannot be blank")
    @Size(min = 3, max = 45, message = "First name must be between 3 and 45 characters long")
    private String firstName;
    @Column(name="Last_Name")
    @NotBlank(message="Last name cannot be blank")
    @Size(min = 3, max = 45, message = "Last name must be between 3 and 45 characters long")
    private String lastName;

    @Column(name="Email", length = 50, unique = true)
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email") // To validate email address
    @NaturalId
    private String email;

    @Column(name="Phone_Number", length = 20, unique = true)
    @NotBlank(message="Phone number is required")
    @Pattern(regexp = "^(\\d{11})$\n", message = "Invalid phone number")
    private String phoneNumber;
    @Column(name="Password", length=100)
    @JsonIgnore
    @NotBlank(message="Password cannot be blank")
    private String password;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Instant updatedAt;

    @Column(name = "deactivated_by")
    private String deactivatedBy;

    @Column(name = "deactivated_at")
    private Instant deactivatedAt;

    @NotNull
    @Column(name = "is_active")
    private Boolean isActive;

    @NotNull
    @Column(name = "is_verified")
    private Boolean isVerified;

    @Column(name = "verified_at")
    private Instant verifiedAt;

    @Column(name="Address")
    @OneToOne
    private Address address;

    @Column(name="Cart")
    @OneToOne
    private Cart cart;

    @Column(name="Order")
    @OneToOne
    private Order order;

    @Column(name="Payment")
    @OneToOne
    private Payment payment;

    @Column(name="Product")
    @ManyToMany(mappedBy = "user")
    private List<Product> products;

    @NotNull(message = "Role is required")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public User(Long id,String firstName,String lastName,String email,
                String phoneNumber,String password,Instant updatedAt,
                String deactivatedBy,Instant deactivatedAt,Boolean isActive,
                Boolean isVerified,Instant verifiedAt,Address address,Cart cart,
                Order order,Payment payment,List<Product> products,Role role){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.password=password;
        this.updatedAt=updatedAt;
        this.deactivatedBy=deactivatedBy;
        this.deactivatedAt=deactivatedAt;
        this.isActive=isActive;
        this.isVerified=isVerified;
        this.verifiedAt=verifiedAt;
        this.address=address;
        this.cart=cart;
        this.order=order;
        this.payment=payment;
        this.products=products;
        this.role=role;
    }

    public User( ){

    }
}
