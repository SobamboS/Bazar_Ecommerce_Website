package com.appsdeveloperblog.app.ws.mobileappws.Utils.token;

import java.util.Optional;

public interface OTPService{
void saveConfirmationOtp(OTP otp);
void setOtpConfirmationAt(String otp);
void deleteExpiredOtp();
Optional<OTP>getConfirmationOtp(String otp);


}
