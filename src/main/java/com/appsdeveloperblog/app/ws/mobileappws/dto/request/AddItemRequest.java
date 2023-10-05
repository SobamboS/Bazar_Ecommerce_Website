package com.appsdeveloperblog.app.ws.mobileappws.dto.request;

import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import lombok.Data;
import org.apache.catalina.User;


@Data
public class AddItemRequest{
    private Product product;
    private int quantity;

    private User user;
}
