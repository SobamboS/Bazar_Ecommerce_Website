package com.appsdeveloperblog.app.ws.mobileappws.user;

import java.util.Optional;

public interface UserService {
     void enableUser(String emailAddress);
String generateToken(User user);
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);

}
