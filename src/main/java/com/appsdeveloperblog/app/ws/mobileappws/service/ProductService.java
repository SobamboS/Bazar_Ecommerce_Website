package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Product;


public interface ProductService{
  String deleteProduct (String productId);
    String createProduct(ProductCreateRequest productCreateRequest);
   String updateProduct(ProductUpdateRequest productUpdateRequest);
   Product findProduct(String productName);
    Product findProductById(String productId);
    String deleteAllProduct();


   // Product showAllProducts();
}
