package com.appsdeveloperblog.app.ws.mobileappws.Product.controller;

import com.appsdeveloperblog.app.ws.mobileappws.Order.service.OrderService;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{
    @Autowired
    private ProductService productService;
    @Autowired
    OrderService orderService;

    @PostMapping("/createProduct")
    public ResponseEntity<ProductCreateResponse> createProduct(@RequestBody ProductCreateRequest productCreateRequest){
        try{
            ProductCreateResponse productCreateResponse = productService.createProduct(productCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(productCreateResponse);
        } catch (RuntimeException e){
            ProductCreateResponse productCreateResponse = new ProductCreateResponse();
            productCreateResponse.setMessage(e.getMessage());
            productCreateResponse.setStatusCode(401);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(productCreateResponse);
        }
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<ProductUpdateResponse> updateProduct(@RequestBody ProductUpdateRequest productUpdateRequest){
        return ResponseEntity.ok(productService.UpdateProduct(productUpdateRequest));
    }
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<ProductDeleteResponse>delete(@PathVariable String id){
        return ResponseEntity.ok(productService.deleteProduct(id));
    }

}
