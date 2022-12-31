package com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDeleteRequest{
    @Id
    private String id;
}
