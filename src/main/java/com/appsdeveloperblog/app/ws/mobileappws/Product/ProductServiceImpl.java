package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Product updateProduct = productRepository.findByProductId(productUpdateRequest.getProductId())
                .orElseThrow(()-> new RuntimeException("Product not found"));

        if(!updateProduct.getProductId().equals(productUpdateRequest.getProductId())){
            updateProduct.setProductPrice(productUpdateRequest.getProductPrice());
            updateProduct.setProductCategory(productUpdateRequest.getProductCategory());
            updateProduct.setProductName(productUpdateRequest.getProductName());
            updateProduct.setProductDescription(productUpdateRequest.getProductDescription());
            productRepository.save(updateProduct);

        }
        return "";
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
//    @Override
//    public Product showAllProducts(){
//      return   productRepository.findAll();
//    }

}
