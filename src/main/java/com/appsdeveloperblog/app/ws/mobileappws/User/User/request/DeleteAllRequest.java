package com.appsdeveloperblog.app.ws.mobileappws.User.User.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data

public class DeleteAllRequest{
    @Id
    private String id;
}
