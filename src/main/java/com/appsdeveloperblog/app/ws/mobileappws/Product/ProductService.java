package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteAllResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.response.ProductUpdateResponse;

public interface ProductService{
    ProductDeleteResponse deleteProduct (String id);
    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);
    ProductUpdateResponse UpdateProduct(ProductUpdateRequest productUpdateRequest);

    ProductDeleteAllResponse deleteAllProduct();

    void showAllProducts();
}
