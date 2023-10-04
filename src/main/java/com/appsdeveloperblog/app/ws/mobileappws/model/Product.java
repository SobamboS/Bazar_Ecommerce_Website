package com.appsdeveloperblog.app.ws.mobileappws.model;


import com.appsdeveloperblog.app.ws.mobileappws.Enum.ProductCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product{

    @Id
    private Long productId;
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
