package com.appsdeveloperblog.app.ws.mobileappws.service.ProductImplementation;

import com.appsdeveloperblog.app.ws.mobileappws.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl{
    @Autowired
    ProductRepository productRepository;


}
