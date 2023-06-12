package com.appsdeveloperblog.app.ws.mobileappws.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>{
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);
Optional<User>findByPhoneNumber(String phoneNumber);

}
