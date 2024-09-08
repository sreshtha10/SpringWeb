package com.learn.SimpleWebApp.service;

import com.learn.SimpleWebApp.model.Product;
import com.learn.SimpleWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts(){
        return repository.findAll();
    }
    
    
    public Product getProductById(int prodId){
        return repository.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
        repository.save(product);
    }

    public void updateProduct(Product product){
        repository.save(product);
    }

    public void deleteProduct(Product product){
        repository.delete(product);
    }

}