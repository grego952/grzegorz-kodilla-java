package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    Map<String, Boolean> airports = new HashMap<>();

    public FlightSearch(Map<String, Boolean> airports) {
        this.airports = airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.get(flight.getArrivalAirport())) {
            System.out.println("Bon Voyage!");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
