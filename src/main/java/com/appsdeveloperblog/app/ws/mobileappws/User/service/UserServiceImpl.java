package com.appsdeveloperblog.app.ws.mobileappws.User.service;

import com.appsdeveloperblog.app.ws.mobileappws.User.repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response.*;

import com.appsdeveloperblog.app.ws.mobileappws.User.model.User;


import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.validator.UserDetailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserResponse createUser(RegistrationRequest registrationRequest){
        User user = new User();
        user.setEmail(registrationRequest.getEmail());
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setPassword(registrationRequest.getPassword());
        user.setPhoneNumber(registrationRequest.getPhoneNumber());

        if(!UserDetailValidator.isValidEmail(registrationRequest.getEmail())){
            throw new RuntimeException(String.format("Email %s is invalid",registrationRequest.getEmail()));
        }
        if(!UserDetailValidator.isValidPassword(registrationRequest.getPassword())){
            throw new RuntimeException(String.format("%s your password must contain special character",registrationRequest.getPassword()));
        }
        if(!UserDetailValidator.isValidPhoneNumber(registrationRequest.getPhoneNumber())){
            throw new RuntimeException(String.format("Phone number %s is not complete", registrationRequest.getPhoneNumber()));
        }

        User savedUser = userRepository.save(user);
        UserResponse response = new UserResponse();
        response.setId(savedUser.getId());
        response.setStatusCode(201);
        response.setMessage("Registration successful");
        return response;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User foundUser = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("Email not found"));
        LoginResponse loginResponse = new LoginResponse();
        if(foundUser.getPassword().equals(loginRequest.getPassword())){
            loginResponse.setMessage("Login is successful");
            return loginResponse;
        }else
            loginResponse.setMessage("Login Unsuccessful, Either the email or password is incorrect");
        return loginResponse;
    }

    @Override
    public UpdateResponse update(UpdateRequest updateRequest){
        User updateUser = userRepository.findById(updateRequest.getId())
                .orElseThrow(()-> new RuntimeException("Id not found"));
        UpdateResponse updateResponse = new UpdateResponse();

        if(updateUser.getId().equals(updateRequest.getId())){
            updateUser.setEmail(updateRequest.getEmail());
            updateUser.setLastName(updateRequest.getLastName());
            updateUser.setFirstName(updateRequest.getFirstName());
            updateUser.setPassword(updateRequest.getPassword());

            userRepository.save(updateUser);
            updateResponse.setMessage("User info updated");
            return updateResponse;
        }else
            updateResponse.setMessage("Not successful");
        return updateResponse;
    }



    @Override
    public DeleteResponse delete(String id){
        userRepository.deleteById(id);
        return new DeleteResponse("User Deleted");
    }


    @Override
    public DeleteAllResponse deleteAll(){
        userRepository.deleteAll();
        return new DeleteAllResponse("All user Deleted");

    }


}
