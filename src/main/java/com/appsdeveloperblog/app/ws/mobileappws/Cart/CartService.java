package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;


public interface CartService{
AddItemResponse addItem(AddItemRequest addItemRequest);
String removeItem(String cartId);
String updateItemNumber(UpdateItemRequest updateItemRequest);
String cloneCart(String cartId);


}
