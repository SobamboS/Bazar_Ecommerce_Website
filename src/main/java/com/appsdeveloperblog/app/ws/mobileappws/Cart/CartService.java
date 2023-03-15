package com.appsdeveloperblog.app.ws.mobileappws.Cart;

import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.AddItemResponse;
import com.appsdeveloperblog.app.ws.mobileappws.Cart.dto.UpdateItemRequest;
import com.appsdeveloperblog.app.ws.mobileappws.Product.Product;

import java.math.BigDecimal;
import java.util.List;

public interface CartService{
AddItemResponse addItem(AddItemRequest addItemRequest);
String deleteItem(String id);
String updateItemNumber(UpdateItemRequest updateItemRequest);
String recountTotal(BigDecimal total);
String cloneCart();
    List<Product> findProductByName(String productName);

}
