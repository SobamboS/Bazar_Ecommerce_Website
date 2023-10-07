package com.appsdeveloperblog.app.ws.mobileappws.Utils.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OTPServiceImpl implements OTPService{
    @Autowired
    OTPRepository otpRepository;

    @Override
    public void saveConfirmationOtp(OTP token){
        otpRepository.save(token);

    }
    @Override
    public void setOtpConfirmationAt(String token){
        otpRepository.confirmedAt(LocalDateTime.now(), token);

    }

    @Override
    public void deleteExpiredOtp( ){
        otpRepository.deleteOtpByExpiredAtBefore(LocalDateTime.now());

    }

    @Override
    public Optional<OTP> getConfirmationOtp(String token){
        return otpRepository.findByOtp(token);
    }
}
