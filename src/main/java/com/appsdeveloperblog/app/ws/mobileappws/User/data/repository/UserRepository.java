package com.appsdeveloperblog.app.ws.mobileappws.User.data.repository;

import com.appsdeveloperblog.app.ws.mobileappws.User.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

   Optional <User> findByEmail(String email);

}
