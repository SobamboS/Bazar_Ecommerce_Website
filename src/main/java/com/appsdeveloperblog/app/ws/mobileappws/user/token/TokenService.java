package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import java.util.Optional;

public interface TokenService{
    void saveConfirmationToken(Token token);
    Optional<Token> getTokenConfirmation(String token);
     void deleteExpiredToken();
      void setTokenConfirmationAt(String token);
}
