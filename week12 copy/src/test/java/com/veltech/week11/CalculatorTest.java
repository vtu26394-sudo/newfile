package com.veltech.week11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final CalculatorController calculator = new CalculatorController();

    @Test
    void testAdd() {
        // Jenkins runs this to check if 2 + 3 actually equals 5
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        // Jenkins runs this to check if 5 - 3 actually equals 2
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(0, calculator.subtract(10, 10));
    }
}