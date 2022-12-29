package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.DeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.LoginRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.RegistrationRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.DeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.LoginResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.UpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.UserResponse;

public interface UserService{

    UserResponse createUser(RegistrationRequest registrationRequest);

    //create, read, update and delete

    LoginResponse login(LoginRequest loginRequest);

    UpdateResponse update(UpdateRequest updateRequest );

    DeleteResponse delete(DeleteRequest deleteRequest);

}
