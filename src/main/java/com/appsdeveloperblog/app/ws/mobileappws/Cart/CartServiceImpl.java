package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;

import java.math.BigDecimal;

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
}
