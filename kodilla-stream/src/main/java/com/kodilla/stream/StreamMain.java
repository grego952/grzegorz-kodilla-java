package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {                                   // [4]

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator beautifulString = (text) -> "Raz, dwa, trzy " + text;
        PoemDecorator metal = (text) -> "<<<" + text +">>>";


        String text1 = poemBeautifier.beautify("Koczkodan",String::toUpperCase);
        String text2 = poemBeautifier.beautify("Karmazyn", String::toLowerCase);
        String text3 = poemBeautifier.beautify("Baba Jaga patrzy", beautifulString);
        String text4 = poemBeautifier.beautify("Metallica", metal);


        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);



    }
}
