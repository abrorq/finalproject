package org.example.dao;

import org.example.WarehouseApplication;

import java.util.List;

interface ProductDAO <Product> {
    List<Product> getAllProducts();

    List<Product> searchProducts1(String keyword);

    List<Product> searchProducts2(String keyword);

    List<Product> filterProductsByPrice(double minPrice, double maxPrice);
}