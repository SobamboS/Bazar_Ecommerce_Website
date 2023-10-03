package com.appsdeveloperblog.app.ws.mobileappws.dto.request.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FindProductRequest{
   @NotBlank
   private String productName;
}
