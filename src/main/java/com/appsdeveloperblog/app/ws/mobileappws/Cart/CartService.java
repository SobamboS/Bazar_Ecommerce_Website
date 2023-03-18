package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;

import java.util.List;


public interface CartService{
 Cart addItem(AddItemRequest addItemRequest);
String removeItem(String cartId);
String updateItemNumber(UpdateItemRequest updateItemRequest);



}
