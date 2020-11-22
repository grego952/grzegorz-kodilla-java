package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        //Countries
        Country country1 = new Country("Belgium", new BigDecimal("11460000"));
        Country country2 = new Country("France", new BigDecimal("66990000"));
        Country country3 = new Country("Spain", new BigDecimal("46940000"));
        Country country4 = new Country("Germany", new BigDecimal("83020000"));
        Country country5 = new Country("Portugal", new BigDecimal("10280000"));
        Country country6 = new Country("Japan", new BigDecimal("126500000"));
        Country country7 = new Country("Bangladesh", new BigDecimal("161400000"));
        Country country8 = new Country("South Korea", new BigDecimal("51640000"));
        Country country9 = new Country("Brazil", new BigDecimal("209500000"));
        Country country10 = new Country("Chile", new BigDecimal("18730000"));

        //Continents
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("South America");
        List<Country> countryList = new ArrayList<>();

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);

        continent2.addCountry(country6);
        continent2.addCountry(country7);
        continent2.addCountry(country8);

        continent3.addCountry(country9);
        continent3.addCountry(country10);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(totalPeopleQuantity, new BigDecimal("786460000"));


    }
}
