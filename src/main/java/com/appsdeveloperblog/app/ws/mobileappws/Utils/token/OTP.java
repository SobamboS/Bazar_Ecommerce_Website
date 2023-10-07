package com.appsdeveloperblog.app.ws.mobileappws.Utils.token;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;


import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OTP{

    @jakarta.persistence.Id
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
    private LocalDateTime createdAt;

    @Column(name = "confirmed_at")
    private LocalDateTime confirmedAt;

    @NotNull
    @Column(name = "expired_at")
    private LocalDateTime expiredAt;

    public void setId(Long id){
        this.id=id;
    }

    public Long getId( ){
        return id;
    }


//    private User user;


}
