package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;



public interface ProductService{
  String deleteProduct (String productId);
    String createProduct(ProductCreateRequest productCreateRequest);
   String updateProduct(ProductUpdateRequest productUpdateRequest);

    String deleteAllProduct();

   // Product showAllProducts();
}
