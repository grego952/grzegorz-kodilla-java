package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheese extends AbstractPizzaOrderDecorator {

    public AdditionalCheese (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + extra cheese";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
}
