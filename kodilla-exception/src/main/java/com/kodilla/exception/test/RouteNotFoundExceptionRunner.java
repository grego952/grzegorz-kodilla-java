package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Map<String, Boolean> openAirports = new HashMap<>();


        openAirports.put("Amsterdam", true);
        openAirports.put("Brussels", true);
        openAirports.put("Dublin", false);
        openAirports.put("Glasgow", false);
        openAirports.put("Helsinki", true);
        openAirports.put("Chicago", true);
        openAirports.put("Moscow", false);
        openAirports.put("Warsaw", true);

        FlightSearch flightSearch = new FlightSearch(openAirports);
        Flight flight = new Flight("Amsterdam", "Warsaw");

        try {
            flightSearch.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Route unavailable");
        }
    }
}
