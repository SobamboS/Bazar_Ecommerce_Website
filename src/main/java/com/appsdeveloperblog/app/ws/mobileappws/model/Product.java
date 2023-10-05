package com.appsdeveloperblog.app.ws.mobileappws.model;


import com.appsdeveloperblog.app.ws.mobileappws.Enum.ProductCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ProductCategory productCategory;
    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private BigDecimal availableProductQuantity;
    private double productWeight;
    private String productImage;

    @NotNull(message = "Created by is required")
    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Instant createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Instant updatedAt;

    @ManyToMany(mappedBy="products")
    private List<User> users;


    public Product(ProductCategory productCategory,
                   String productName,BigDecimal productPrice,String productDescription,
                   BigDecimal availableProductQuantity,double productWeight){
        this.productName=productName;
        this.productCategory=productCategory;
        this.productPrice=productPrice;
        this.productDescription=productDescription;
        this.availableProductQuantity=availableProductQuantity;
        this.productWeight=productWeight;

    }
}
