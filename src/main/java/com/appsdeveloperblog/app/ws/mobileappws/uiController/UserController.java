//package com.appsdeveloperblog.app.ws.mobileappws.uiController;
//
//import com.appsdeveloperblog.app.ws.mobileappws.models.User;
//import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
//import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.RegistrationRequest;
////import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.UserDto;
//import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.UserResponse;
//import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
//import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//public class UserController{
//    @Autowired
//    UserService userService;
//
//    @GetMapping()
//    public String getUser(){
//        return "Get user called";
//    }
//
//
//    @PostMapping("/users")
//    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails){
//        UserRest returnValue = new UserRest();
//
//        RegistrationRequest registrationRequest = new RegistrationRequest();
//        BeanUtils.copyProperties(userDetails, registrationRequest);
//
//        RegistrationRequest createdUser = userService.createUser(userRest);
//        BeanUtils.copyProperties(createdUser, returnValue);
//        return returnValue;
//    }
//
//
//    @PutMapping
//    public String updateUser(){
//        return "Update user was called";
//    }
//    @DeleteMapping
//    public  String deleteUser(){
//         return " Delete user was called ";
// }
//}
