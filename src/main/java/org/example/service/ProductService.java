package org.example.service;

import org.example.dao.daoimplementation.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    List<Product> searchProductsByCategory(String category, String keyword);
    List<Product> filterProductsByPrice(double minPrice, double maxPrice);
}
