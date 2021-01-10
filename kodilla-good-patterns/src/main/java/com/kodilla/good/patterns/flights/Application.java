package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner();

       flightScanner.findFlightsFrom("Warszawa");
       flightScanner.findFlightsTo("Poznań");
       flightScanner.findFlightsThrough("Wrocław", "Poznań");
    }
}
