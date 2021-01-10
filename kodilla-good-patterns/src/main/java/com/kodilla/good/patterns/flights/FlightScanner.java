package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightScanner {

    public static List<Flight> getFlightList() {

       final List <Flight> flightList = new ArrayList<>();

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

    public List <Flight> findFlights(String departureCity, String arrivalCity, String via, List <Flight> flightList) {

        List <Flight> flightsTo = flightList.stream()
                .filter(s -> s.getFlightTo().equals(arrivalCity))
                .filter(s -> s.getFlightFrom().equals(via))
                .collect(Collectors.toList());

        List <Flight> flightsFrom = flightList.stream()
                .filter(s -> s.getFlightFrom().equals(departureCity))
                .filter(s -> s.getFlightTo().equals(via))
                .collect(Collectors.toList());

        List <Flight> newFlightList = new ArrayList<>();
        newFlightList.addAll(flightsTo);
        newFlightList.addAll(flightsFrom);

        return newFlightList;

    }

}
