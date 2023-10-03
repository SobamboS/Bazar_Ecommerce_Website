package com.appsdeveloperblog.app.ws.mobileappws.Payment.dto;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.Cart;
import lombok.Data;
import org.apache.catalina.User;
@Data
public class MakePaymentRequest{
    private User user;
    private Cart cart;

}
