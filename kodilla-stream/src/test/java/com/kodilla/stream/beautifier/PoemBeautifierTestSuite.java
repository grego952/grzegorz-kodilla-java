package com.kodilla.stream.beautifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoemBeautifierTestSuite {

    @Test
    void testBeautifier() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator decorate = (text) -> "()() " + text + " ()()";

        //When
        String text = poemBeautifier.beautify("Jabadabadoo", decorate);

        //Then
        assertEquals ("()() Jabadabadoo ()()", text);

    }
}
