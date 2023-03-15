package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteAllResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductUpdateResponse;

public interface ProductService{
  String deleteProduct (String id);
    String createProduct(ProductCreateRequest productCreateRequest);
   String UpdateProduct(ProductUpdateRequest productUpdateRequest);

    String deleteAllProduct();
    String deleteProduct();

    void showAllProducts();
}
