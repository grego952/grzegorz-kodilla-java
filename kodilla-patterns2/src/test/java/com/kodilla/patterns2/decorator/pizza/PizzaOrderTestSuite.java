package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaWithHamAndExtraCheeseGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ItalianCookedHam(theOrder);
        theOrder = new AdditionalCheese(theOrder);

        //When
        String ingredients = theOrder.getIngredient();

        //Then
        assertEquals("dough + tomato sauce with cheese + Italian cooked ham + extra cheese", ingredients);

    }

    @Test
    void testPizzaWithHamAndExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ItalianCookedHam(theOrder);
        theOrder = new AdditionalCheese(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    void testPizzaWithAllIngredientsGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PassataDecorator(theOrder);
        theOrder = new ItalianCookedHam(theOrder);
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new AdditionalCheese(theOrder);

        //When
        String ingredients = theOrder.getIngredient();

        //Then
        assertEquals("dough + tomato sauce with cheese + Passata + Italian cooked ham + mozzarella + extra cheese", ingredients);
    }

    @Test
    void testPizzaWithAllIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PassataDecorator(theOrder);
        theOrder = new ItalianCookedHam(theOrder);
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new AdditionalCheese(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(41), cost);

    }
}
