package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.exception.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("product")
public class CartController{
    @Autowired
    CartService cartService;

    @PostMapping("/signup")
    public ResponseEntity<?> addItem(@RequestBody @Valid AddItemRequest addItemRequest,
                                    HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(cartService.addItem(addItemRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeItem(@RequestBody @Valid String cartId,
                                     HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(cartService.removeItem(cartId))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/updateItemNumber")
    public ResponseEntity<?> updateItemNumber(@RequestBody @Valid UpdateItemRequest updateItemRequest,
                                     HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(cartService.updateItemNumber(updateItemRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
