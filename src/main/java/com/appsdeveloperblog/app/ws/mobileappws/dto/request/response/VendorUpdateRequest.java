package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;


import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class VendorUpdateRequest{
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
