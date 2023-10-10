package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.MakePaymentRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.model.Payment;
import com.appsdeveloperblog.app.ws.mobileappws.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

   private final UserRepository userRepository;

    public PaymentServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public Payment makePayment(MakePaymentRequest makePaymentRequest){
        Payment request = new Payment();
      //  request.setPaymentTotal(makePaymentRequest.getCart().getCartTotal());
       // request.setUserEmail(makePaymentRequest.getUser().get);

       // request.getCart().getCartTotal();
      //  request.getUser().get

        return null;
    }



}
