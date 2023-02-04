package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.user.registration.dto.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Override
    public String signup(SignupRequest signupRequest){
        boolean emailExists = userRepository
                .findByEmailAddressIgnoreCase(signupRequest.getEmailAddress())
                .isPresent();
        if(emailExists)throw new IllegalStateException("Email Address already exist");
        User user= new User(
                signupRequest.getFirstName(),
                signupRequest.getLastName(),
                signupRequest.getEmailAddress(),
                signupRequest.getPassword()
        );
        userRepository.save(user);
        return
         
    }
}
