package com.appsdeveloperblog.app.ws.mobileappws.user;

import java.io.IOException;
import java.util.Optional;

public interface UserService {
     void enableUser(String emailAddress);
String generateToken(User user);
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);
Optional<User>findByUserId(String userId);
String verifyPhoneNumber(String phoneNumber)throws IOException;

}
