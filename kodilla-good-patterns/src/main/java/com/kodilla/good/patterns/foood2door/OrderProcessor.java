package com.kodilla.good.patterns.foood2door;

public class OrderProcessor {

    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public boolean isOrderSent() {

        if (order.isOrderedPayed()) {
            return true;
        }
        return false;
    }

    public boolean orderProcessed() {
        if(!isOrderSent() && order.isOrderedPayed()) {
            System.out.println("The order is being processed");
            return true;
        }
        return false;
    }

    public boolean orderCancellation() {
        if (!order.isOrderedPayed()) {
            System.out.println("Your order has been cancelled");
            return true;
        }
        return false;
    }
}
