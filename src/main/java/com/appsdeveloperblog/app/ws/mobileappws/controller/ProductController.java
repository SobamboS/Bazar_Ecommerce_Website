package com.appsdeveloperblog.app.ws.mobileappws.controller;

import com.appsdeveloperblog.app.ws.mobileappws.service.OrderService;
import com.appsdeveloperblog.app.ws.mobileappws.service.ProductService;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
public class ProductController{
    @Autowired
    private ProductService productService;
    @Autowired
    OrderService orderService;

    @PostMapping("/createProduct")
    public ResponseEntity<?> createProduct(@RequestBody @Valid ProductCreateRequest productCreateRequest,
                                    HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(productService.createProduct(productCreateRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestBody @Valid String productId,
                                           HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(productService.deleteProduct(productId))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<?> updateProduct(@RequestBody @Valid ProductUpdateRequest productUpdateRequest,
                                           HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(productService.updateProduct(productUpdateRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/findProduct")
    public ResponseEntity<?> findProduct(@RequestBody @Valid String productName,
                                         HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(productService.findProduct(productName))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/findProductById")
    public ResponseEntity<?> findProductById(@RequestBody @Valid String productId,
                                           HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(ZonedDateTime.now())
                .data(productService.findProductById(productId))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }




}
