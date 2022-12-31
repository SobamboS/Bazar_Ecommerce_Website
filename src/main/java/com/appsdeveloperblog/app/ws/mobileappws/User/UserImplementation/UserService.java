package com.appsdeveloperblog.app.ws.mobileappws.User.UserImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.User.User.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.User.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.User.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.User.User.response.*;

public interface UserService{

    //create, read, update and delete
    UserResponse createUser(RegistrationRequest registrationRequest);


    LoginResponse login(LoginRequest loginRequest);

    UpdateResponse update(UpdateRequest updateRequest );

    DeleteResponse delete(String id);
    DeleteAllResponse deleteAll(String id);
}
