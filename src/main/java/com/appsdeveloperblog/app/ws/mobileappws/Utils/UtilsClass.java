package com.appsdeveloperblog.app.ws.mobileappws.Utils;

import lombok.NoArgsConstructor;

import java.security.SecureRandom;

@NoArgsConstructor
public class UtilsClass{


    public static String generateOtp() {

        SecureRandom random = new SecureRandom();

        return String.valueOf(100000 + random.nextInt(900000));
    }


}
