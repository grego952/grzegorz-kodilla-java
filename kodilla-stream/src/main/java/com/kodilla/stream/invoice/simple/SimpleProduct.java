package com.kodilla.stream.invoice.simple;

public class SimpleProduct {
    private final String productName;
    private final double ProductPrice;

    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        ProductPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;
        SimpleProduct that = (SimpleProduct) o;
        return productName.equals(that.productName);
    }

}
