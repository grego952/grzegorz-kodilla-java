package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner();

       flightScanner.findFlights("Warszawa", "Poznań", "Wrocław", FlightScanner.getFlightList());
    }

}
