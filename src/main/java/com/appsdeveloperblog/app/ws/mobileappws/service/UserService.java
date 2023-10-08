package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;

import java.io.IOException;
import java.util.Optional;

public interface UserService {
     void enableUser(String emailAddress);
String generateOtp(User user);
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);
Optional<User>findByUserId(Long id);
String verifyPhoneNumber(String phoneNumber)throws IOException;

}
