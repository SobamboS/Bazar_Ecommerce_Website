package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import lombok.Data;

@Data
public class AddItemResponse{
    private Product product;
    private int quantity;
}
