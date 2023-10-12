package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.CartRepository;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.AddItemRequest;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import com.appsdeveloperblog.app.ws.mobileappws.service.CartService;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@Slf4j
public class CartServiceImpl implements CartService{

   private final ProductRepository productRepository;


   private final CartRepository cartRepository;

    private final   UserService userService;

    private final   UserRepository userRepository;

    public CartServiceImpl(ProductRepository productRepository,CartRepository cartRepository,
                           UserService userService,UserRepository userRepository){
        this.productRepository=productRepository;
        this.cartRepository=cartRepository;
        this.userService=userService;
        this.userRepository=userRepository;
    }

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
    public Cart removeProduct(Long Id){
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
