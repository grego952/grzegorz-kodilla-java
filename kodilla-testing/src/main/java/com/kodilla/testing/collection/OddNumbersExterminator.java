package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {

        List <Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {

            if (number % 2 == 0) {
                evenNumbers.add(number);
                System.out.println(evenNumbers);
            }
        }
        return evenNumbers;

    }
}
