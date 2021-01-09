package com.kodilla.good.patterns.foood2door;

public class Application {
    public static void main(String[] args) {

        Order order = new Order();
        Producer producer = new GoodFoodShop(order);

        producer.process(order);
    }
}
