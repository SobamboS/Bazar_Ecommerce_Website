package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
Optional<User>findByEmailIgnoreCase(String emailAddress);
Optional<User>findByPhoneNumber(String phoneNumber);

}
