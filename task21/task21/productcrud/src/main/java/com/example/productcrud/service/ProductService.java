package com.example.productcrud.service;

import com.example.productcrud.entity.Product;
import com.example.productcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Product save(Product product){
        return repository.save(product);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Product getById(Long id){
        return repository.findById(id).orElse(null);
    }

}