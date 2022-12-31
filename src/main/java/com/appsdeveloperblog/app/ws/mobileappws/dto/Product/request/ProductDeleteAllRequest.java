package com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDeleteAllRequest{
    @Id
    private String id;
}
