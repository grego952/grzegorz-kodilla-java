package com.kodilla.good.patterns.foood2door;

public class ProducerInvoker {

    private Producer producer;

    public ProducerInvoker(Producer producer) {
        this.producer = producer;
    }

    public void invoke(OrderProcessor orderProcessor) {
        producer.process(orderProcessor);
    }
}
