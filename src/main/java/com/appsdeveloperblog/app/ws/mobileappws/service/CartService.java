package com.appsdeveloperblog.app.ws.mobileappws.service;

import com.appsdeveloperblog.app.ws.mobileappws.dto.request.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;


public interface CartService{
 Cart addItemToCart(AddItemRequest addItemRequest);
 Cart removeProduct(Long id);
Cart updateItemNumber(UpdateItemRequest updateItemRequest);
Cart viewProductInCart();





}
