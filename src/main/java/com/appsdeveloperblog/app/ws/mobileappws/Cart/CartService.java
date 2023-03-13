package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;

import java.math.BigDecimal;

public interface CartService{
AddItemResponse addItem(AddItemRequest addItemRequest);
String deleteItem(String id);
String updateItemNumber(UpdateItemRequest updateItemRequest);
String recountTotal(BigDecimal total);
String cloneCart();

}
