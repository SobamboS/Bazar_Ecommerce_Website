package com.appsdeveloperblog.app.ws.mobileappws.OTP;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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

    @Modifying
    @Query("UPDATE OTP confirmOtp SET confirmOtp.confirmedAt = ?1 WHERE confirmOtp.email = ?2")
    void confirmedAt(Instant now, String token);

}
