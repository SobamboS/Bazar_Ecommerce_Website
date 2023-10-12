package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.service.CartService;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("product")
public class CartController{

    private final CartService cartService;

    public CartController(CartService cartService){
        this.cartService=cartService;
    }

    @PostMapping("/createCart")
    public ResponseEntity<?> addItemToCart(@RequestBody @Valid AddItemRequest addItemRequest,
                                    HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(cartService.addItemToCart(addItemRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeProduct(@PathVariable @Valid Long id,
                                     HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(cartService.removeProduct(id))
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
                .timeStamp(Instant.now())
                .data(cartService.updateItemNumber(updateItemRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
