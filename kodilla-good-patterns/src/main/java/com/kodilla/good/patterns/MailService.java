package com.kodilla.good.patterns;

import java.sql.SQLOutput;

public class MailService implements InformationService {

    @Override
    public void orderReceived() {
        System.out.println("Thank you for your order");
    }

    @Override
    public void orderProcessed() {

        System.out.println("Your order is being processed. Thank you for your patience");

    }

    @Override
    public void orderSent() {

        System.out.println("Your order has been sent");

    }
}
