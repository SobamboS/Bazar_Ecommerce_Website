package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.MakePaymentRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Payment;

public interface PaymentService {
 Payment makePayment(MakePaymentRequest makePaymentRequest);
}
