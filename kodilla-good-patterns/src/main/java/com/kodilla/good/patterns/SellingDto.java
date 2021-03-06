package com.kodilla.good.patterns;

public class SellingDto {

    public User user;
    public boolean isSold;

    public SellingDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
