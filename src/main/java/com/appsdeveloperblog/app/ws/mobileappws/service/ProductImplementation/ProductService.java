package com.appsdeveloperblog.app.ws.mobileappws.service.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request.ProductDeleteRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.Product.response.ProductUpdateResponse;

public interface ProductService{
    ProductDeleteResponse deleteProduct (ProductDeleteRequest ProductdeleteRequest);
    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);
    ProductUpdateResponse UpdateProduct(ProductUpdateRequest productUpdateRequest);
}
