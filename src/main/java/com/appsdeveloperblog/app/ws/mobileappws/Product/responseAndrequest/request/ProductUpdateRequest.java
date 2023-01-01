package com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.request;

import com.appsdeveloperblog.app.ws.mobileappws.Product.model.ProductCategory;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductUpdateRequest{
    @Id
    private String id;
    private ProductCategory productCategory;
    private String name;
    private double price;
    private String description;
    private int quantity;
}
