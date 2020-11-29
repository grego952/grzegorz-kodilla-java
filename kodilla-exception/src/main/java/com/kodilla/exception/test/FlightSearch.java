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

        if (airports.get(flight.getDepartureAirport())) {
            System.out.println("Airport available for Departure");
        } else {
            throw new RouteNotFoundException();
        }

        if (airports.get(flight.getArrivalAirport())) {
            System.out.println("Airport available for Arrival");
        } else {
            throw new RouteNotFoundException();
        }

    }
}
