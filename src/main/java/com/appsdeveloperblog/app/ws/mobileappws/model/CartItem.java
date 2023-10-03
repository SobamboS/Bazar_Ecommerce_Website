package com.appsdeveloperblog.app.ws.mobileappws.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CartItem{
    private  String cartItemId;
    private Product cartProduct;
    private int quantity;
}
