package com.appsdeveloperblog.app.ws.mobileappws.Payment;

import com.appsdeveloperblog.app.ws.mobileappws.Payment.dto.MakePaymentRequest;

public interface PaymentService {
 Payment makePayment(MakePaymentRequest makePaymentRequest);
}
