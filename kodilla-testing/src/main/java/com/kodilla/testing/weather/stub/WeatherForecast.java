package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map <String, Double> calculateForecast() {
        Map <String, Double> resultMap = new HashMap<>();

        for (Map.Entry <String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemp(Map<String, Double> averageMap) {
        int sum = 0;
        for (Map.Entry <String, Double> averageTemp : averageMap.entrySet()) {
            sum += averageTemp.getValue();
        }
        double average = sum / averageMap.size();
        return average;

    }
    public double calculateMedianTemp(Map <String, Double> medianMap) {
        Double [] valuesSet = medianMap.values().toArray(new Double[medianMap.size()]);
        double median = 0.0;
        double twoCenterValuesAvg = 0.0;
        Arrays.sort(valuesSet);
        if (valuesSet.length % 2 == 0) {
            twoCenterValuesAvg = valuesSet[valuesSet.length / 2] + valuesSet[(valuesSet.length / 2) - 1];
            median = twoCenterValuesAvg / 2.0;
        } else {
            median = valuesSet[valuesSet.length / 2];
        }
        return median;

    }
}
