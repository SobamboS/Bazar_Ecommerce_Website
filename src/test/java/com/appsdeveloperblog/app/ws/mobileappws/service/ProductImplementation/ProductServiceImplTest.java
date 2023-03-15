package com.appsdeveloperblog.app.ws.mobileappws.service.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.appsdeveloperblog.app.ws.mobileappws.Product.ProductCategory.SUPERMARKET;
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
        productUpdateRequest.setId("63aecaad1a21453e6c5f46a7");
        productUpdateRequest.setPrice(400);
        ProductUpdateResponse productUpdateResponse = productService.UpdateProduct(productUpdateRequest);
        System.out.println(productUpdateResponse);
        assertEquals("Product Added Successfully", productUpdateResponse.getMessage());
    }


    @Test
    void deleteProduct( ){
        ProductDeleteResponse productDeleteResponse = productService.deleteProduct("63aecaad1a21453e6c5f46a7");
        System.out.println(productDeleteResponse);
        assertEquals("Product Deleted", productDeleteResponse.getMessage());

    }

}