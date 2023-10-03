package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import lombok.Data;
import org.apache.catalina.User;
@Data
public class MakePaymentRequest{
    private User user;
    private Cart cart;

}
