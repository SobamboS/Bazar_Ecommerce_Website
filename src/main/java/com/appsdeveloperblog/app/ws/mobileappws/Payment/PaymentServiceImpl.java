package com.appsdeveloperblog.app.ws.mobileappws.Payment;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    UserRepository userRepository;

    @Override
    public Payment makePayment(MakePaymentRequest makePaymentRequest){
        Payment request = new Payment();
        request.setPaymentTotal(makePaymentRequest.getCart().getCartTotal());
       // request.setUserEmail(makePaymentRequest.getUser().get);

        request.getCart().getCartTotal();
      //  request.getUser().get

        return null;
    }



}
