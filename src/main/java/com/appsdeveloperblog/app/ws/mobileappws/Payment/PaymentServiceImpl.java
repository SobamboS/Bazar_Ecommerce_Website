package com.appsdeveloperblog.app.ws.mobileappws.Payment;

import com.appsdeveloperblog.app.ws.mobileappws.Payment.dto.MakePaymentRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
