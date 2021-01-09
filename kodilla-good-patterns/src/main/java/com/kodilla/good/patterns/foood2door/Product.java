package com.kodilla.good.patterns.foood2door;

public class Product {

    String name;
    String productType;
    int quantity;

    public Product(String name, String productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
