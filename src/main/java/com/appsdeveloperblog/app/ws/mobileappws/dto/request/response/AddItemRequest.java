package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class AddItemRequest{
    private Product product;
    private int quantity;
    @DBRef
    private User user;
}
