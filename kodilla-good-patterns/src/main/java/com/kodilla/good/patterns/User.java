package com.kodilla.good.patterns;

public class User {

    private String username;
    private String shippingAddress;

    public User(String username, String shippingAddress) {
        this.username = username;
        this.shippingAddress = shippingAddress;
    }

    public String getUsername() {
        return username;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }
}
