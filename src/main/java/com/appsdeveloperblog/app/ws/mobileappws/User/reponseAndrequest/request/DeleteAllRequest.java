package com.appsdeveloperblog.app.ws.mobileappws.User.reponseAndrequest.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data

public class DeleteAllRequest{
    @Id
    private String id;
}
