package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.FindProductRequest;

import java.util.List;
import java.util.Optional;


public interface ProductService{
  String deleteProduct (String productId);
    String createProduct(ProductCreateRequest productCreateRequest);
   String updateProduct(ProductUpdateRequest productUpdateRequest);
   Product findProduct(String productName);
    Product findProductById(String productId);
    String deleteAllProduct();


   // Product showAllProducts();
}
