package com.cg.iter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.entities.Product;
import com.cg.iter.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired private ProductService service;
    
    @GetMapping("/home")
    public String createSample() {
        return "Welcome ITER";
    }
    
    @GetMapping("/getall/products")
    public List<Product> getAll(){
        return service.getAll();
    }
    
    @GetMapping("/findall/product/{id}")
    public Product findProductById(@PathVariable("id") int id){
        return service.find(id);
    }
}