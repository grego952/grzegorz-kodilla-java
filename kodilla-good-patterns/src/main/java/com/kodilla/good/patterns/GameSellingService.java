package com.kodilla.good.patterns;

import java.time.LocalDateTime;

public class GameSellingService implements SellingService{
    @Override
    public boolean sell(User user, Product product, LocalDateTime requestDate) {
        return true;
    }
}
