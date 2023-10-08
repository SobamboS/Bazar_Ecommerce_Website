package com.appsdeveloperblog.app.ws.mobileappws.OTP;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@RequiredArgsConstructor
public class ScheduleOTPExpiry{

    private final OTPService otpService;


   @Scheduled(cron="0 10 0 * * *")
    public void otpExpiredAt(){
       System.out.println("Deleted");
       otpService.deleteExpiredOtp();
   }
}
