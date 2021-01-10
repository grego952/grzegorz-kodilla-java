package com.kodilla.good.patterns.foood2door;

public class HealthyShop implements Producer {

    @Override
    public OrderStatus process(OrderProcessor orderProcessor) {
        if (orderProcessor.isOrderSent()) {

            return OrderStatus.COMPLETED;
        }
        orderProcessor.orderProcessed();

        return OrderStatus.IN_PROGRESS;
    }
}
