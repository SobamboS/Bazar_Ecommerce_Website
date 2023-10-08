package com.appsdeveloperblog.app.ws.mobileappws.OTP;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OTPServiceImpl implements OTPService{

    private final OTPRepository otpRepository;

    @Override
    public void saveConfirmationOtp(OTP token){
        otpRepository.save(token);

    }
    @Override
    public void setOtpConfirmationAt(String token){
        otpRepository.confirmedAt(Instant.now(), token);

    }

    @Override
    public void deleteExpiredOtp( ){
        otpRepository.deleteOtpByExpiredAtBefore(Instant.now());

    }

    @Override
    public Optional<OTP> getConfirmationOtp(String token){
        return otpRepository.findByOtp(token);
    }
}
