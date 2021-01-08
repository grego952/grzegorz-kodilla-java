package com.kodilla.good.patterns;

import java.time.LocalDateTime;

public class SellRequestRetriever {

    public SellRequest retrieve() {

        User user = new User("loki450", "Chicago street 15/20, Chicago, USA");

        LocalDateTime requestDate = LocalDateTime.of(2020,3,15,15,33);


        return new SellRequest(user, new Product("Cyberpunk 2077", 145.50, 1),requestDate);

    }

}
