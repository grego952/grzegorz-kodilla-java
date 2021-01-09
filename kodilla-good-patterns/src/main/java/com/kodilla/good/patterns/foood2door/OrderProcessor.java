package com.kodilla.good.patterns.foood2door;

import java.sql.SQLOutput;

public class OrderProcessor {

    private Order order;
    private Producer producer;
    private Client client;

    public OrderProcessor(Order order, Producer producer) {
        this.order = order;
        this.producer = producer;
    }

    public Order getOrder() {
        return order;
    }

    public Producer getProducer() {
        return producer;
    }

    public void orderRequest() {

        System.out.println("Order request from " + client + " for " + order +" from " + producer);

    }

}
