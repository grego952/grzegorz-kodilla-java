package com.kodilla.good.patterns.foood2door;

import java.util.Set;

public class Order {

    Set<Product> productList;

    public Order(Set<Product> productList) {
        this.productList = productList;
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void addProduct (Product product) {
        productList.add(product);
    }

    public boolean isOrderedPayed() {
        return true;
    }
}
