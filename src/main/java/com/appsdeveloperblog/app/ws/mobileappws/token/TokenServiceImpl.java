package com.appsdeveloperblog.app.ws.mobileappws.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    TokenRepository tokenRepository;

    @Override
    public void saveConfirmationToken(Token token){
        tokenRepository.save(token);

    }
    @Override
    public void setTokenConfirmationAt(String token){
        tokenRepository.confirmedAt(LocalDateTime.now(), token);

    }

    @Override
    public void deleteExpiredToken( ){
        tokenRepository.deleteTokenByExpiredAtBefore(LocalDateTime.now());

    }

    @Override
    public Optional<Token> getConfirmationToken(String token){
        return tokenRepository.findByToken(token);
    }
}
