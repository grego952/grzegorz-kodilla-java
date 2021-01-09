package com.kodilla.good.patterns.foood2door;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        Producer producer = new GoodFoodShop();
        Set<Product> productList = new HashSet<>();
        Order order = new Order(productList);
        OrderProcessor orderProcessor = new OrderProcessor(order);

        producer.process(orderProcessor);
    }
}
