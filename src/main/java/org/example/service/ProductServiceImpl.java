package org.example.service;

import org.example.dao.daoimplementation.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final List<Product> inventory;

    public ProductServiceImpl() {
        inventory = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        inventory.add(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return inventory;
    }

    @Override
    public List<Product> searchProductsByCategory(String category, String keyword) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : inventory) {
            if (product.getCategory().equalsIgnoreCase(category) &&
                    (product.getName().toLowerCase().contains(keyword) ||
                            product.getCategory().toLowerCase().contains(keyword))) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    @Override
    public List<Product> filterProductsByPrice(double minPrice, double maxPrice) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : inventory) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }
}
