package com.technokratos.agonacache.service;

import com.technokratos.agonacache.model.Product;
import com.technokratos.agonacache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BaseProductService implements ProductService {

    private final ProductRepository productRepository;

    @Override
    @CachePut(cacheNames = "product", key = "#product.id")
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Cacheable(cacheNames = "product", key = "#id")
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    @Cacheable(cacheNames = "products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    @CachePut(cacheNames = "product", key = "#product.id")
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    @CacheEvict(cacheNames = "product", key = "#id")
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }
}