package com.appsdeveloperblog.app.ws.mobileappws.token;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Token{
    @Id
    private String id;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime confirmedAt;
    private LocalDateTime expiredAt;
    
    @DBRef
    private User user;

    public Token(String token,LocalDateTime createdAt,LocalDateTime expiredAt, User user){
        this.token=token;
        this.createdAt=createdAt;
        this.expiredAt=expiredAt;
        this.user = user;
    }
}
