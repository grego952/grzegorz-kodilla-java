package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {
        int allNumbers = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum();

        double averageNumbers = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        return averageNumbers;
    }

}
