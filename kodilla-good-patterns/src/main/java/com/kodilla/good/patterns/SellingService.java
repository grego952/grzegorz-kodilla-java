package com.kodilla.good.patterns;

import java.time.LocalDateTime;

public interface SellingService {

    boolean sell(User user, Product product, LocalDateTime requestDate);
}
