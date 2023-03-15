package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;

import java.math.BigDecimal;
import java.util.List;

public class CartServiceImpl implements CartService{
    @Override
    public AddItemResponse addItem(AddItemRequest addItemRequest){
        return null;
    }

    @Override
    public String deleteItem(String id){
        return null;
    }

    @Override
    public String updateItemNumber(UpdateItemRequest updateItemRequest){
        return null;
    }

    @Override
    public String recountTotal(BigDecimal total){
        return null;
    }

    @Override
    public String cloneCart( ){
        return null;
    }

    @Override
    public List<Product> findProductByName(String productName){
        return null;
    }
}
