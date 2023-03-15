package com.appsdeveloperblog.app.ws.mobileappws.Cart.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import lombok.Data;

@Data
public class AddItemRequest{
    private Product product;
    private int quantity;
}
