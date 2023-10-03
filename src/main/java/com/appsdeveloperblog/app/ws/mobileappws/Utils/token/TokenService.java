package com.appsdeveloperblog.app.ws.mobileappws.Utils.token;

import java.util.Optional;

public interface TokenService{
void saveConfirmationToken(Token token);
void setTokenConfirmationAt(String token);
void deleteExpiredToken();
Optional<Token>getConfirmationToken(String token);


}