package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductCreateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.dto.ProductUpdateRequest;
import com.appsdeveloperblog.app.ws.mobileappws.user.dto.FindProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
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
        Product updateProduct = productRepository.findByProductId(productUpdateRequest.getProductId())
                .orElseThrow(()-> new RuntimeException("Product not found"));

        if(!updateProduct.getProductId().equals(productUpdateRequest.getProductId())){
            updateProduct.setProductPrice(productUpdateRequest.getProductPrice());
            updateProduct.setProductCategory(productUpdateRequest.getProductCategory());
            updateProduct.setProductName(productUpdateRequest.getProductName());
            updateProduct.setProductDescription(productUpdateRequest.getProductDescription());
            productRepository.save(updateProduct);

        }
        return "Product Updated successfully ";
    }

    @Override
    public List<Product> findProduct(FindProductRequest findProductRequest){
            List<Product> product=productRepository.findByProductName(findProductRequest.getProductName())
                    .orElseThrow(( ) -> new RuntimeException("Product not found"));

//        if(product.getProductName().isEmpty()){
//            throw new RuntimeException(String.format("%s not found ",findProductRequest.getProductName()));
//        }

            if(!product.getProductName().equalsIgnoreCase(findProductRequest.getProductName())){
                throw new RuntimeException(String.format(" %s not found, please check for another product",findProductRequest.getProductName()));
            }
            return product ;
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


}
