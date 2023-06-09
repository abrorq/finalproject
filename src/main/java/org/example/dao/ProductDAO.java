package org.example.dao;

import org.example.dao.daoimplementation.Product;

import java.util.List;

public interface ProductDAO {
    void addProduct(Product product);
    List<Product> getAllProducts();
    List<Product> searchProductsByCategory(String category, String keyword);
    List<Product> filterProductsByPrice(double minPrice, double maxPrice);
}