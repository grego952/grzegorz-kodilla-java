package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigMac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .burgers(3)
                .ingredient("onion")
                .ingredient("bacon")
                .sauce("barbecue")
                .ingredient("cheese")
                .ingredient("pickle")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals (4, howManyIngredients);


    }
}
