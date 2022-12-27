package com.appsdeveloperblog.app.ws.mobileappws.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
@Entity(name="users")
public class UserEntity  implements Serializable{
    @Serial
    private static final long serialVersionUID=-7466364510437308617L;
    @Id
    @GeneratedValue
    private long  id;

    @Column(nullable=false)
     private String userId;

    @Column(nullable=false, length=50)
    private String firstName;

    @Column(nullable=false, length=50)
    private String lastName;

    @Column(nullable=false, length=120)
    private String email;

    @Column(nullable=false)
    private String encryptedPassword;

    private String emailVerification;

    @Column(nullable=false)
    private boolean emailVerificationStatus = false;

    public long getId( ){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getUserId( ){
        return userId;
    }

    public void setUserId(String userId){
        this.userId=userId;
    }

    public String getFirstName( ){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName( ){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getEmail( ){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEncryptedPassword( ){
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword){
        this.encryptedPassword=encryptedPassword;
    }

    public String getEmailVerification( ){
        return emailVerification;
    }

    public void setEmailVerification(String emailVerification){
        this.emailVerification=emailVerification;
    }

    public boolean isEmailVerificationStatus( ){
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(boolean emailVerificationStatus){
        this.emailVerificationStatus=emailVerificationStatus;
    }
}

