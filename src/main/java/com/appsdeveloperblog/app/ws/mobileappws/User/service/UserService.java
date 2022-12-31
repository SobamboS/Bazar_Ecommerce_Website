package com.appsdeveloperblog.app.ws.mobileappws.User.service;

import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.response.*;

public interface UserService{

    //create, read, update and delete
    UserResponse createUser(RegistrationRequest registrationRequest);

    LoginResponse login(LoginRequest loginRequest);

    UpdateResponse update(UpdateRequest updateRequest );

    DeleteResponse delete(String id);
    DeleteAllResponse deleteAll(String id);
}
