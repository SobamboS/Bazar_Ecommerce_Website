package com.appsdeveloperblog.app.ws.mobileappws;

import com.appsdeveloperblog.app.ws.mobileappws.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

   Optional <User> findByEmail(String email);

}
