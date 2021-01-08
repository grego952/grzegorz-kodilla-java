package com.kodilla.good.patterns;

public class Application {
    public static void main(String[] args) {
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new GameSellingService(), new GameSellingRepository());
        productOrderService.process(sellRequest);
    }
}
