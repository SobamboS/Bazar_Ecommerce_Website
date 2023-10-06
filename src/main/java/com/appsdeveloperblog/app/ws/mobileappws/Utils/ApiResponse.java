package com.appsdeveloperblog.app.ws.mobileappws.Utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
public class ApiResponse{
    private Instant timeStamp;
    private boolean isSuccessful;
    private Object data;
    private int status;
    private String path;
}
