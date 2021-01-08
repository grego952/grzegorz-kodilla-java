package com.kodilla.good.patterns;

import java.time.LocalDateTime;
import java.util.List;

public interface SellingRepository {
    void createRepository(User user, Product product, LocalDateTime requestDate);
}
