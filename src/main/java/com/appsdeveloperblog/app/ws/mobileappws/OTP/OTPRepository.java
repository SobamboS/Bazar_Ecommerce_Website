package com.appsdeveloperblog.app.ws.mobileappws.OTP;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface OTPRepository extends JpaRepository<OTP, Long>{
    Optional<OTP>findByOtp(String otp);

    Optional<OTP> findByOtpAndEmail(String otp, String email);

    void deleteOtpByExpiredAtBefore(Instant now);

    @Transactional
    void confirmedAt(Instant now, String token);

}
