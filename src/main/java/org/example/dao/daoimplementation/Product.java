package org.example.dao.daoimplementation;

public class Product {
    private final String id;
    private final String name;
    private final String category;
    private final double price;
    private final int quantity;

    public Product(int id, String name, String category, double price, int quantity) {
        this.id = String.valueOf(id);
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public String getCategory() {

        return category;
    }


    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
