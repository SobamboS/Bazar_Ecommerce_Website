package com.appsdeveloperblog.app.ws.mobileappws.User.User.request;

import jakarta.persistence.Id;
import lombok.Data;

    @Data
public class DeleteRequest{
        @Id
    private String id;

}
