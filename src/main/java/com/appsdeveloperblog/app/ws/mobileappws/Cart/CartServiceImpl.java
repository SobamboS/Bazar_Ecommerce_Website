package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
@Slf4j
public class CartServiceImpl implements CartService{
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart addItem(AddItemRequest addItemRequest){
        var product = productRepository.findByProductName(addItemRequest.getProduct().getProductName())
                .orElseThrow(()-> new ArrayIndexOutOfBoundsException("Product not available"));

        cartRepository.save()
        if(product.getProductName().equalsIgnoreCase(addItemRequest.getProduct().getProductName())){
          cart.add(addItemRequest.getProduct().getProductId());
        }
        return null;
    }








    @Override
    public String removeItem(String cartId){
        cartRepository.de


        return null;
    }

    @Override
    public String updateItemNumber(UpdateItemRequest updateItemRequest){
        return null;
    }


    public String  recountTotal(BigDecimal total){
        return null;
    }



}
