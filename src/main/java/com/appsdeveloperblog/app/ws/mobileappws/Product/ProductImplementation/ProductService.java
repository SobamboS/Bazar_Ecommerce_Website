package com.appsdeveloperblog.app.ws.mobileappws.Product.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductDeleteAllResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductUpdateResponse;

public interface ProductService{
    ProductDeleteResponse deleteProduct (String id);
    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);
    ProductUpdateResponse UpdateProduct(ProductUpdateRequest productUpdateRequest);

    ProductDeleteAllResponse deleteAllProduct ();

    void showAllProducts();
}
