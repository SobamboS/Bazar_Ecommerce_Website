package com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDeleteRequest{
    @Id
    private String id;
}
