package com.kodilla.good.patterns;

import java.time.LocalDateTime;

public interface SellingRepository {
    void createRepository(User user, Product product, LocalDateTime requestDate);
}
