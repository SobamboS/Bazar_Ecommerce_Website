package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;

import java.util.List;


public interface CartService{
 Cart addItemToCart(AddItemRequest addItemRequest);
 Cart removeItem(String cartId);
Cart updateItemNumber(UpdateItemRequest updateItemRequest);
Cart viewProductInCart();





}
