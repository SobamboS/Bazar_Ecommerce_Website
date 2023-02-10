package com.appsdeveloperblog.app.ws.mobileappws.user;

public interface UserService {
     void enableUser(String emailAddress);
String generateToken(User user);
}
