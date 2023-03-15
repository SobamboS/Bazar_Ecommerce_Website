package com.appsdeveloperblog.app.ws.mobileappws.Product.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductCategory;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductCreateRequest{
    @NotBlank
    @Size(max=100)
    private String productName;

    @NotBlank(message="Field is required")
    @Size(max=5000)
    private String productDescription;

    @Pattern(regexp="^\\d+$")
    private BigDecimal productPrice;

    @NotBlank
    private ProductCategory productCategory;

    @Pattern(regexp="^\\d+$")
    private BigDecimal availableProductQuantity;

}
