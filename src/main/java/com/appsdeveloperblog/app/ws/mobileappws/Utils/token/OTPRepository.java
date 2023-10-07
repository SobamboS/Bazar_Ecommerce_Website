package com.appsdeveloperblog.app.ws.mobileappws.Utils.token;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface OTPRepository extends JpaRepository<OTP, Long>{
    Optional<OTP>findByOtp(String otp);

    void deleteOtpByExpiredAtBefore(LocalDateTime now);

    @Transactional
    void confirmedAt(LocalDateTime now, String token);

}
