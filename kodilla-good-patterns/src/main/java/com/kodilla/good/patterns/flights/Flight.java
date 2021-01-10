package com.kodilla.good.patterns.flights;

public class Flight {

    private String flightTo;
    private String flightFrom;

    public Flight(String flightTo, String flightFrom) {
        this.flightTo = flightTo;
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightTo.equals(flight.flightTo)) return false;
        return flightFrom.equals(flight.flightFrom);
    }

    @Override
    public int hashCode() {
        int result = flightTo.hashCode();
        result = 31 * result + flightFrom.hashCode();
        return result;
    }
}
