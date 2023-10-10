package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Product;


public interface ProductService{
  String deleteProduct (Long id);
    String createProduct(ProductCreateRequest productCreateRequest);
   String updateProduct(ProductUpdateRequest productUpdateRequest);
   Product findProduct(String productName);
    Product findProductById(Long id);
    String deleteAllProduct();


   // Product showAllProducts();
}
