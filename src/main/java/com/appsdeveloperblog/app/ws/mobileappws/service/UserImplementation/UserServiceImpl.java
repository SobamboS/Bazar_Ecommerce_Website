package com.appsdeveloperblog.app.ws.mobileappws.service.UserImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.DeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.LoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.UpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.UserResponse;

import com.appsdeveloperblog.app.ws.mobileappws.models.User;


import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.LoginRequest;
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
            updateResponse.setMessage("Id found");
            return updateResponse;
        }else
            updateResponse.setMessage("Id not found");
        return updateResponse;
    }



    @Override
    public DeleteResponse delete(String id){
        userRepository.deleteById(id);
        return new DeleteResponse("Vendor Deleted");
    }


}
