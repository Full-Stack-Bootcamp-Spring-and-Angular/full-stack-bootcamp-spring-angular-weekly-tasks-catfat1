package com.adminPanel.app.service;

import com.adminPanel.app.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);
    void update(Product product);
    void delete(int id);
    Product getById(int id);
    List<Product> getAll();
}