package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.CartRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.AddItemRequest;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.service.CartService;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@Slf4j
public class CartServiceImpl implements CartService{
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepository cartRepository;

   @Autowired
    UserService userService;
@Autowired
   UserRepository userRepository;
    @Override
    public Cart addItemToCart(AddItemRequest addItemRequest){
       // Cart userCart = new Cart();
//       List< Product>   product =(List<Product>) productRepository.findByProductId(addItemRequest.getProduct().getProductId())
//                .orElseThrow(()-> new RuntimeException(String.format("%s product not available",addItemRequest.getProduct().getProductId())));
//
//        List<Product> cartItem=null;
//                //= (List<Product>);
//        if(cartItem == null){
//            cartItem =new ArrayList<>();
//        }


        //        var product = productRepository.findByProductName
//                        (addItemRequest.getProduct().getProductName())
//                .orElseThrow(()-> new ArrayIndexOutOfBoundsException("Product not available"));
//
//        if(product.getProductName().equalsIgnoreCase(addItemRequest.getProduct().getProductName())){
//            cartRepository.addProducts(product);
//
//        }return cartRepository.save(product);
        return null;
    }

    @Override
    public Cart removeProduct(String cartId){
        return null;
    }

    @Override
    public Cart updateItemNumber(UpdateItemRequest updateItemRequest){
        return null;
    }

    @Override
    public Cart viewProductInCart( ){
        return null;
    }




    public String  recountTotal(BigDecimal total){
        return null;
    }



}
