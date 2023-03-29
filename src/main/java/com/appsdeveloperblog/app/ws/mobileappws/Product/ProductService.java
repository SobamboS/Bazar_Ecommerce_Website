package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.FindProductRequest;

import java.util.List;


public interface ProductService{
  String deleteProduct (String productId);
    String createProduct(ProductCreateRequest productCreateRequest);
   String updateProduct(ProductUpdateRequest productUpdateRequest);
   List<Product> findProduct(String productName);
   List<Product> findProductById(String productId);

    String deleteAllProduct();

   // Product showAllProducts();
}
