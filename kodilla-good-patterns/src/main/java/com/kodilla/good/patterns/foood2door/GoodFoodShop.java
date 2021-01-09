package com.kodilla.good.patterns.foood2door;

import java.time.LocalDateTime;

public class GoodFoodShop implements Producer{


    public void orderedProducts (Order order) {
        order.addProduct(new Product("Apples", "Fruits", 150));
    }
    @Override
    public OrderStatus process (OrderProcessor orderProcessor) {

        if (orderProcessor.isOrderSent()) {

            return OrderStatus.COMPLETED;
        }
        if (orderProcessor.orderProcessed()) {

            return OrderStatus.IN_PROGRESS;

        } if (orderProcessor.orderCancellation()) {
            return OrderStatus.CANCELLED;
        }
        return OrderStatus.IN_PROGRESS;
    }
}
