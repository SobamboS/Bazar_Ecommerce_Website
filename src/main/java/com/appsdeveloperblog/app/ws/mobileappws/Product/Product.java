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
    private String name;
    private double price;
    private String description;

}
