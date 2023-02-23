package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Token{
    @Id
    private String id;
    private String token;
    private String createdAt;
    private String confirmedAt;
    private String expiredAt;
    
    @DBRef
    private User user;

    public Token(String token,String createdAt,String confirmedAt,User user){
        this.token=token;
        this.createdAt=createdAt;
        this.confirmedAt=confirmedAt;
        this.user = user;
    }
}
