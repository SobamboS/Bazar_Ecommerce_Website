package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;



    @Override
    public String createProduct(ProductCreateRequest productCreateRequest) {
        Product createProduct = new Product();
        createProduct.setProductName(productCreateRequest.getProductName());
        createProduct.setProductPrice(productCreateRequest.getProductPrice());
        createProduct.setProductCategory(productCreateRequest.getProductCategory());
        createProduct.setProductDescription(productCreateRequest.getProductDescription());
        productRepository.save(createProduct);
        return "Product added successfully";
    }
    @Override
    public String UpdateProduct(ProductUpdateRequest productUpdateRequest){
        Product updateProduct = productRepository.findByProductId(productUpdateRequest.getId())

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
    public String deleteAllProduct( ){
        productRepository.deleteAll();
        return "All Product Deleted";
    }

    @Override
    public String deleteProduct(String id){
        productRepository.deleteById(id);
        return "Product Deleted";
    }
    @Override
    public void showAllProducts(){
        productRepository.findAll();
    }

}
