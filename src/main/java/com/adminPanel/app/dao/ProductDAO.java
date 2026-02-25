package com.adminPanel.app.dao;

import com.adminPanel.app.entity.Product;

import java.util.List;

public interface ProductDAO {

    void save(Product product);

    void update(Product product);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}

