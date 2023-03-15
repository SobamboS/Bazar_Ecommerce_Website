package com.appsdeveloperblog.app.ws.mobileappws.Cart.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import lombok.Data;

@Data
public class AddItemResponse{
    private Product product;
    private int quantity;
}
