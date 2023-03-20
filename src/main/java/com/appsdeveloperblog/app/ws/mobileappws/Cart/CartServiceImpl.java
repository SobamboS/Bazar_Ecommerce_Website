package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.Testing;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import com.appsdeveloperblog.app.ws.mobileappws.Product.ProductRepository;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserRepository;
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
    UserRepository userRepository;

    @Override
    public Cart createCart(AddItemRequest addItemRequest){
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

    public String createCart(Testing testing){
        var findUser = userRepository.findByEmailAddressIgnoreCase
                (testing.getUser().getEmailAddress());
        var findUserId = userRepository.findById(testing.getUser().getUserId());

        Cart newCart =cartRepository.findCartByUserId(testing.getUser().getUserId(),l)

return "";
    }


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


    public void addProducts(Product product){
        Cart addProduct = new Cart();
        addProduct.getProductContainer().add(product);
    }







    @Override
    public String removeItem(String cartId){

       // cartRepository.


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
