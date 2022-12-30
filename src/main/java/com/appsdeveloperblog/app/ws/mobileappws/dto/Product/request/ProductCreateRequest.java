package com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request;

import com.appsdeveloperblog.app.ws.mobileappws.models.ProductCategory;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductCreateRequest{
    private String name;
    private String description;
    private double price;
    @Id
    private String id;
    private ProductCategory productCategory;

}
