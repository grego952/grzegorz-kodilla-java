package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ItalianCookedHam extends AbstractPizzaOrderDecorator {

    public ItalianCookedHam(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + Italian cooked ham";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }
}
