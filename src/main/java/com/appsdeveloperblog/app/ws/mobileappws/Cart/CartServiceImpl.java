package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


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

//    public String createCart(Testing testing){
//        var findUser = userRepository.findByEmailAddressIgnoreCase
//                (testing.getUser().getEmailAddress());
//        var findUserId = userRepository.findById(testing.getUser().getUserId());
//
//        Cart newCart =cartRepository.findCartByUserId(testing.getUserId());
//
//return "";
//    }


//    public Cart getOrCreateCart(Testing testing) {
//
//        Cart optionalCart = cartRepository.findCartByUserId(testing.getUser().getUserId());
//        if (optionalCart.isPresent()) {
//            return optionalCart.get();
//        } else {
//            Cart newCart = new Cart();
//            newCart.setUsername(username);
//            return cartRepository.save(newCart);
//        }
//    }


//    public void addProducts(Product product){
//        Cart addProduct = new Cart();
//        addProduct.getProductContainer().add(product);
//    }







//    @Override
//    public String removeItem(String cartId){
//
//       // cartRepository.
//
//
//        return null;
//    }

//    @Override
//    public String updateItemNumber(UpdateItemRequest updateItemRequest){
//        return null;
//    }


    public String  recountTotal(BigDecimal total){
        return null;
    }



}
