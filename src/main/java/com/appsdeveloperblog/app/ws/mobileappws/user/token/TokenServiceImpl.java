package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl  implements TokenService{
    @Autowired
    TokenRepository  tokenRepository;
    @Override
    public void saveConfirmationToken(Token token){
        tokenRepository.save(token);
    }
}
