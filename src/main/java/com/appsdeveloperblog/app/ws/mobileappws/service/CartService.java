package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.response.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;


public interface CartService{
 Cart addItemToCart(AddItemRequest addItemRequest);
 Cart removeProduct(String cartId);
Cart updateItemNumber(UpdateItemRequest updateItemRequest);
Cart viewProductInCart();





}
