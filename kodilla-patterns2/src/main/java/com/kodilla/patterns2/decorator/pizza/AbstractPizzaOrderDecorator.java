package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public String getIngredient() {
        return pizzaOrder.getIngredient();
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }
}
