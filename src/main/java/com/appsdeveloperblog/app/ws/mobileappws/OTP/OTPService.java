package com.appsdeveloperblog.app.ws.mobileappws.OTP;

import java.util.Optional;

public interface OTPService{
void saveVerificationOtp(OTP otp);
void setOtpConfirmationAt(String otp);
void deleteExpiredOtp();
Optional<OTP>getConfirmationOtp(String otp);


}
