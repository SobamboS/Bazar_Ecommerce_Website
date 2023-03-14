package com.appsdeveloperblog.app.ws.mobileappws.Product;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product{
    @Id
    private String id;
    private ProductCategory productCategory;
    private String productName;
    private double productPrice;
    private String productDescription;
    private int productQuantity;
    private double productWeight;

}
