package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Product;
import com.appsdeveloperblog.app.ws.mobileappws.service.ProductService;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService{


   private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public String createProduct(ProductCreateRequest productCreateRequest){
        Product product = new Product(
                productCreateRequest.getProductCategory(),
                productCreateRequest.getProductName(),
                productCreateRequest.getProductPrice(),
                productCreateRequest.getProductDescription(),
                productCreateRequest.getAvailableProductQuantity(),
                productCreateRequest.getProductWeight());
        productRepository.save(product);
        return (String.format("%s added successfully", product));
    }

    @Override
    public String updateProduct(ProductUpdateRequest productUpdateRequest){
        Product updateProduct = productRepository.findByProductName(productUpdateRequest.getProductName());


//                .orElseThrow(()-> new RuntimeException("Product not found"));
//
//
//        if(!updateProduct.getProductId().equals(productUpdateRequest.getProductId())){
//            updateProduct.setProductPrice(productUpdateRequest.getProductPrice());
//            updateProduct.setProductCategory(productUpdateRequest.getProductCategory());
//            updateProduct.setProductName(productUpdateRequest.getProductName());
//            updateProduct.setProductDescription(productUpdateRequest.getProductDescription());
            productRepository.save(updateProduct);

      //  }//
        return "Product Updated successfully ";
    }

    @Override
    public Product findProduct(String productName){
            Product product= productRepository.findByProductName(productName);
            if(productName.isEmpty()){
                throw new RuntimeException(String.format(" %s not found, please check for another product",productName));
            }
            return product;
        }


        @Override
        public Product findProductById(Long id){
        Product products= productRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));

//        if(productId.isEmpty()){
//            throw new RuntimeException(String.format("%s not found", productId));
//        }
        return products;
        }


    @Override
    public String deleteAllProduct( ){
        productRepository.deleteAll();
        return "All Product Deleted";
    }


    @Override
    public String deleteProduct(Long id){
        productRepository.deleteById(id);
        return "Product Deleted";
    }


}
