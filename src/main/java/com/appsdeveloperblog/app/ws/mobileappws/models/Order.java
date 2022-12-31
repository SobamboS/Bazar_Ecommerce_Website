package com.appsdeveloperblog.app.ws.mobileappws.models;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Order{
    @Id
    private String id;
    private String userId;
    private double total;
    private List<Product> orderProducts = new ArrayList<>();
}
