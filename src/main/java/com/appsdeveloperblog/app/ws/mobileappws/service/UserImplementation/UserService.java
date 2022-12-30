package com.appsdeveloperblog.app.ws.mobileappws.service.UserImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.DeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.DeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.LoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.UpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.User.response.UserResponse;

public interface UserService{

    //create, read, update and delete
    UserResponse createUser(RegistrationRequest registrationRequest);


    LoginResponse login(LoginRequest loginRequest);

    UpdateResponse update(UpdateRequest updateRequest );

    DeleteResponse delete(DeleteRequest deleteRequest);

}
