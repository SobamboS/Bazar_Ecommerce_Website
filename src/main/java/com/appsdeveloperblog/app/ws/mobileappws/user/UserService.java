package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.user.registration.dto.SignupRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserService {
    String signup(SignupRequest signupRequest);
}
