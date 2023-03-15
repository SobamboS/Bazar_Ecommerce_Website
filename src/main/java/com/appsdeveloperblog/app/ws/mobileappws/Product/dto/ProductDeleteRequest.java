package com.appsdeveloperblog.app.ws.mobileappws.Product.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDeleteRequest{
    @Id
    private String id;
}
