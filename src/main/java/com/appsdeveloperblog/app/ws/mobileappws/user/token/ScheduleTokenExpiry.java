package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@RequiredArgsConstructor
public class ScheduleTokenExpiry{
    @Autowired
    TokenService tokenService;


   @Scheduled(cron="0 10 0 * * *")
    public void tokenExpiredAt(){
       System.out.println("Deleted");
       tokenService.deleteExpiredToken();
   }
}
