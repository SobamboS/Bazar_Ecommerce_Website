package com.appsdeveloperblog.app.ws.mobileappws.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class SignupResponse{
private String emailAddress;
private String firstName;
private String lastName;
private String token;
}
