package com.kodilla.good.patterns.foood2door;

public class ExtraFoodShop implements Producer {

    public void orderedProducts (Order order) {
        order.addProduct(new Product("Extra Chicken", "Meat", 25));
    }

    @Override
    public OrderStatus process(OrderProcessor orderProcessor) {

        if (orderProcessor.isOrderSent()) {

            return OrderStatus.COMPLETED;
        }

        return OrderStatus.IN_PROGRESS;
    }
}
