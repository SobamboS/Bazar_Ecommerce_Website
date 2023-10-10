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

import java.time.Instant;

@RestController
public class ProductController{

   private final ProductService productService;

   private final OrderService orderService;

    public ProductController(ProductService productService,OrderService orderService){
        this.productService=productService;
        this.orderService = orderService;
    }

    @PostMapping("/createProduct")
    public ResponseEntity<?> createProduct(@RequestBody @Valid ProductCreateRequest productCreateRequest,
                                    HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(productService.createProduct(productCreateRequest))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestBody @Valid Long id,
                                           HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(productService.deleteProduct(id))
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
                .timeStamp(Instant.now())
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
                .timeStamp(Instant.now())
                .data(productService.findProduct(productName))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/findProductById")
    public ResponseEntity<?> findProductById(@RequestBody @Valid Long id,
                                           HttpServletRequest httpServletRequest){
        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .isSuccessful(true)
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .data(productService.findProductById(id))
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }




}
