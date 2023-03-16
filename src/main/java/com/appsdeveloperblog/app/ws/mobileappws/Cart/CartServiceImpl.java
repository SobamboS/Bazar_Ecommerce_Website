package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
@Slf4j
public class CartServiceImpl implements CartService{
    @Override
    public AddItemResponse addItem(AddItemRequest addItemRequest){
        return null;
    }

    @Override
    public String deleteItem(String cartId){
        return null;
    }

    @Override
    public String updateItemNumber(UpdateItemRequest updateItemRequest){
        return null;
    }


    public String recountTotal(BigDecimal total){
        return null;
    }

    @Override
    public String cloneCart(String cartId ){
        return null;
    }

//    @Override
//    public Product findProductByName(String productName){
//        return null;
//    }
}
