package com.kodilla.good.patterns.foood2door;

import java.time.LocalDateTime;

public class GoodFoodShop implements Producer{

    Order order;

    public GoodFoodShop(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void orderedProducts () {
        order.addProduct(new Product("Apples", "Fruits", 150));
    }
    @Override
    public void process() {

        LocalDateTime requestDate = LocalDateTime.of(2020, 10, 23, 12,12);

        if(order.isOrderSent(new Client("Sklep u Mietka", requestDate), order)) {

        }
    }
}
