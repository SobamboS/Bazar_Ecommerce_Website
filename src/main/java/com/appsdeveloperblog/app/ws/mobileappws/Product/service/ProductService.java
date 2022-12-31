package com.appsdeveloperblog.app.ws.mobileappws.Product.service;

import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.response.ProductDeleteAllResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.responseAndrequest.response.ProductUpdateResponse;

public interface ProductService{
    ProductDeleteResponse deleteProduct (String id);
    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);
    ProductUpdateResponse UpdateProduct(ProductUpdateRequest productUpdateRequest);


    ProductDeleteAllResponse deleteAllProduct ();

    void showAllProducts();
}
