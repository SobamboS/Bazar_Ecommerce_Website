package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, String>{
Optional<User>findByEmailAddressIgnoreCase(String emailAddress);
Optional<User>findByPhoneNumber(String phoneNumber);

}
