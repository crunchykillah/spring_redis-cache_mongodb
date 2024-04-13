package com.technokratos.agonacache.service;

import com.technokratos.agonacache.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    Optional<Product> getProductById(String id);

    List<Product> getAllProducts();

    Product updateProduct(Product product);

    void deleteProductById(String id);
}
