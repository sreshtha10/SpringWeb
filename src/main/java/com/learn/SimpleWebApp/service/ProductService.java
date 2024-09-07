package com.learn.SimpleWebApp.service;

import com.learn.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",500), new Product(102,"Laptop",1000))) ;

    public List<Product> getProducts(){
        return products;
    }
    
    
    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(001,"Default",0));
    }

    public void addProduct(Product product){
        products.add(product);
    }

}