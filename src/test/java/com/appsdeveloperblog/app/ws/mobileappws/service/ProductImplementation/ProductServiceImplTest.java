package com.appsdeveloperblog.app.ws.mobileappws.service.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.response.ProductUpdateResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.appsdeveloperblog.app.ws.mobileappws.models.ProductCategory.SUPERMARKET;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceImplTest{
    @Autowired
    private ProductService productService;

    private ProductCreateRequest productCreateRequest;

    @BeforeEach
    void setUp(){
        productCreateRequest =new ProductCreateRequest();
        productCreateRequest.setPrice(50.56);
        productCreateRequest.setName("Milo");
        productCreateRequest.setProductCategory(SUPERMARKET);
        productCreateRequest.setDescription("Home beverage");
    }
    @Test
    void canCreateProduct( ){
        ProductCreateResponse response = productService.createProduct(productCreateRequest);
        assertNotNull(response);
        System.out.println(response);
        assertEquals("Product added", response.getMessage());

    }

    @Test
    void canUpdateProduct( ){
        ProductUpdateRequest productUpdateRequest = new ProductUpdateRequest();
        productUpdateRequest.setId("63ae98f62f13997653e4b9db");
        productUpdateRequest.setPrice(400);
        ProductUpdateResponse productUpdateResponse = productService.UpdateProduct(productUpdateRequest);
        System.out.println(productUpdateResponse);
        assertEquals("Product Added Successfully", productUpdateResponse.getMessage());
    }


    @Test
    void deleteProduct( ){

    }

}