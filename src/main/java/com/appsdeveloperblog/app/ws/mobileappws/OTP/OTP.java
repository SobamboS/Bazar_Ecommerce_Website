package com.appsdeveloperblog.app.ws.mobileappws.OTP;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;



import java.time.Instant;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OTP{


    @Id
    @Column(nullable = false, name = "Id")
    @SequenceGenerator(name = "seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String otp;

    @Email(message = "Invalid email")
    private String email;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Instant createdAt;

    @Column(name = "confirmed_at")
    private Instant confirmedAt;

    @NotNull
    @Column(name = "expired_at")
    private Instant expiredAt;


}
