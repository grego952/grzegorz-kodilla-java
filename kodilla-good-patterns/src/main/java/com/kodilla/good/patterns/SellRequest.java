package com.kodilla.good.patterns;

import java.time.LocalDateTime;
import java.util.List;

public class SellRequest {

    private User user;
    private Product product;
    private LocalDateTime requestDate;

    public SellRequest(User user, Product product, LocalDateTime requestDate) {
        this.user = user;
        this.product = product;
        this.requestDate = requestDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }
}
