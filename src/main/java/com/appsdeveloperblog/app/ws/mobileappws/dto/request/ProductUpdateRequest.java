package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import com.appsdeveloperblog.app.ws.mobileappws.Enum.ProductCategory;
import lombok.Data;


import java.math.BigDecimal;

@Data
public class ProductUpdateRequest{

    private ProductCategory productCategory;
    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private BigDecimal availableProductQuantity;
}
