package com.kodilla.patterns2.facade;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductServiceTestSuite {

    @Test
    void testGetPrice() {
        //Given
        ProductService productService = new ProductService();

        //When
        BigDecimal result = productService.getPrice(1L);

        //Then
        assertTrue (result.compareTo(BigDecimal.ZERO) > 0);
    }
}
