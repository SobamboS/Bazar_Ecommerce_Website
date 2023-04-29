package com.appsdeveloperblog.app.ws.mobileappws.Product.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductCategory;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest{
    @Id
    private String productId;
    private ProductCategory productCategory;
    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private BigDecimal availableProductQuantity;
}
