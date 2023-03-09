package com.appsdeveloperblog.app.ws.mobileappws.user;

import com.appsdeveloperblog.app.ws.mobileappws.exception.RegistrationException;
import com.appsdeveloperblog.app.ws.mobileappws.user.email.EmailSender;
import com.appsdeveloperblog.app.ws.mobileappws.user.token.Token;
import com.appsdeveloperblog.app.ws.mobileappws.user.token.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    EmailSender emailSender;

    @Autowired
    UserRepository userRepository;

    @Autowired
    TokenService tokenService;


    @Override
    public void enableUser(String emailAddress){
        var foundUser = userRepository.findByEmailAddressIgnoreCase(emailAddress)
                .orElseThrow(() -> new RegistrationException("Invalid email"));
        foundUser.setIsVerified(true);
    }

     @Override
    public String generateToken(User user){
        SecureRandom secureRandom = new SecureRandom();
        String token = String.valueOf(1000+ secureRandom.nextInt(9999));
        Token confirmationToken = new Token(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(10),
                user
        );
        tokenService.saveConfirmationToken(confirmationToken);
    return  confirmationToken.getToken();
    }

    @Override
    public Optional<User> findByEmailAddressIgnoreCase(String emailAddress){
        return userRepository.findByEmailAddressIgnoreCase(emailAddress);
    }


}
