package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PassataDecorator extends AbstractPizzaOrderDecorator {

    public PassataDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + Passata";
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }


}
