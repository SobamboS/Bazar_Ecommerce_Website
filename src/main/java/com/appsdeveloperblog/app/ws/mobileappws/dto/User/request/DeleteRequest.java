package com.appsdeveloperblog.app.ws.mobileappws.dto.User.request;

import jakarta.persistence.Id;
import lombok.Data;

    @Data
public class DeleteRequest{
        @Id
    private String id;
        private String firstName;
        private String lastName;
        private String email;

}
