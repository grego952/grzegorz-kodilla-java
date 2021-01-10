package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightScanner {

    public static List<Flight> getFlightList() {

        final List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Warszawa", "Poznań"));
        flightList.add(new Flight("Radom", "Gdańsk"));
        flightList.add(new Flight("Kraków", "Warszawa"));
        flightList.add(new Flight("Wrocław", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Poznań"));
        flightList.add(new Flight("Poznań", "Gdańsk"));
        flightList.add(new Flight("Gdańsk", "Wrocław"));
        flightList.add(new Flight("Warszawa", "Kraków"));

        return new ArrayList<>(flightList);
    }

    public List<Flight> findFlightsFrom(String departureCity) {

        List<Flight> flightsFrom = getFlightList().stream()
                .filter(s -> s.getFlightFrom().equals(departureCity))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrivalCity) {
        List<Flight> flightsTo = getFlightList().stream()
                .filter(s -> s.getFlightTo().equals(arrivalCity))
                .collect(Collectors.toList());

        return flightsTo;
    }

    public List<Flight> findFlightsThrough(String viaCity, String arrivalCity) {
        List<Flight> flightsThrough = getFlightList().stream()
                .filter(s -> s.getFlightTo().equals(arrivalCity))
                .filter(s -> s.getFlightFrom().equals(viaCity))
                .collect(Collectors.toList());

        return flightsThrough;
    }
}
