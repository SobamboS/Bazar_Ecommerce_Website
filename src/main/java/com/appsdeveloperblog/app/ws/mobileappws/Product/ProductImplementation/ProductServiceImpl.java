package com.appsdeveloperblog.app.ws.mobileappws.Product.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductCreateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductDeleteAllResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductDeleteResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product.response.ProductUpdateResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;



    @Override
    public ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest) {
        Product createProduct = new Product();
        createProduct.setName(productCreateRequest.getName());
        createProduct.setPrice(productCreateRequest.getPrice());
        createProduct.setProductCategory(productCreateRequest.getProductCategory());
        createProduct.setDescription(productCreateRequest.getDescription());
        Product createdProduct = productRepository.save(createProduct);
        ProductCreateResponse response = new ProductCreateResponse();
        response.setMessage("Product added");
        return response;
    }
    @Override
    public ProductUpdateResponse UpdateProduct(ProductUpdateRequest productUpdateRequest){
        Product updateProduct = productRepository.findById(productUpdateRequest.getId())
                .orElseThrow(()-> new RuntimeException("Product not found"));
        ProductUpdateResponse productUpdateResponse = new ProductUpdateResponse();
        if(updateProduct.getId().equals(productUpdateRequest.getId())){
            updateProduct.setPrice(productUpdateRequest.getPrice());
            updateProduct.setProductCategory(productUpdateRequest.getProductCategory());
            updateProduct.setName(productUpdateRequest.getName());
            updateProduct.setDescription(productUpdateRequest.getDescription());
            productRepository.save(updateProduct);
            productUpdateResponse.setMessage("Product Added Successfully");
            return productUpdateResponse;
        }else
            productUpdateResponse.setMessage("Product Not Added");
        return productUpdateResponse;
    }

    @Override
    public ProductDeleteAllResponse deleteAllProduct( ){
        productRepository.deleteAll();;
        return new ProductDeleteAllResponse("All Product Deleted");
    }

    @Override
    public ProductDeleteResponse deleteProduct(String id){
        productRepository.deleteById(id);
        return new ProductDeleteResponse("Product Deleted");
    }
    @Override
    public void showAllProducts( ){
        productRepository.findAll();
    }

}
