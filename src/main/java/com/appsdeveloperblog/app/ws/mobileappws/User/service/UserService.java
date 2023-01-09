package com.appsdeveloperblog.app.ws.mobileappws.User.service;

import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.dto.response.*;


public interface UserService{

    //create, read, update and delete
    UserResponse createUser(RegistrationRequest registrationRequest);

    LoginResponse login(LoginRequest loginRequest);

    UpdateResponse update(UpdateRequest updateRequest );

    DeleteResponse delete(String id);
    DeleteAllResponse deleteAll();
}
