package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.FindProductRequest;

import java.util.List;


public interface ProductService{
  String deleteProduct (String id);
    String createProduct(ProductCreateRequest productCreateRequest);
   String UpdateProduct(ProductUpdateRequest productUpdateRequest);

    String deleteAllProduct();

   // Product showAllProducts();
}
