package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Token{
    private String token;
    @Id
    private String id;
    private LocalDateTime confirmedAt;
    private LocalDateTime expiredAt;
    private LocalDateTime createdAt;
    @DBRef
    private User user;

    public Token(){}

    public Token(String token,
                 LocalDateTime expiredAt,
                 LocalDateTime createdAt,User user){
        this.token=token;
        this.expiredAt=expiredAt;
        this.createdAt=createdAt;
        this.user=user;
    }
}
