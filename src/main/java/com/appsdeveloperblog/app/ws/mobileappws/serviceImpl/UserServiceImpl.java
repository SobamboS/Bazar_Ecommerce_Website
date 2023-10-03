package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import com.appsdeveloperblog.app.ws.mobileappws.service.ProductService;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.exception.RegistrationException;
import com.appsdeveloperblog.app.ws.mobileappws.email.EmailSender;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.token.Token;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.token.TokenService;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
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
    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;


    @Override
    public void enableUser(String emailAddress){
        var foundUser=userRepository.findByEmailAddressIgnoreCase(emailAddress)
                .orElseThrow(( ) -> new RegistrationException("Invalid email"));
        foundUser.setIsVerified(true);
    }


    @Override
    public String generateToken(User user){
        SecureRandom secureRandom=new SecureRandom();
        String token=String.valueOf(1000 + secureRandom.nextInt(9999));
        Token confirmationToken=new Token(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(10),
                user
        );
        tokenService.saveConfirmationToken(confirmationToken);
        return confirmationToken.getToken();
    }

    @Override
    public Optional<User> findByEmailAddressIgnoreCase(String emailAddress){
        return userRepository.findByEmailAddressIgnoreCase(emailAddress);
    }
    public Optional<User>findByUserId(String userId){
        return userRepository.findById(userId);
    }

    @Override
    public String verifyPhoneNumber(String phoneNumber) throws IOException{
        boolean phoneExist = userRepository.findByPhoneNumber(phoneNumber)
                .isPresent();
        if(phoneExist)throw new IllegalStateException("Phone number used by another user");
      //  String numberToken =userService.generateToken();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://telesign-telesign-send-sms-verification-code-v1.p.rapidapi.com/sms-verification-code?phoneNumber=%3CREQUIRED%3E&verifyCode=%3CREQUIRED%3E"
                        + phoneNumber)
                .post(null)
                .addHeader("content-type", "application/octet-stream")
                .addHeader("X-RapidAPI-Key", "9a405fd9e0mshb07bfed4568853ep133d49jsnd9215d3bed12")
                .addHeader("X-RapidAPI-Host", "telesign-telesign-send-sms-verification-code-v1.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();

    return  "Phone number verified successfully";}


}