package com.foxminded.integerDivisione;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerDivisionTests {
    IntegerDivisioner integerDivision = new IntegerDivisioner();
    @Test
    void divisionInteger_shouldReturnInteger_whenGivenZeroDivide() throws Exception {
        assertThrows(ArithmeticException.class, () -> integerDivision.divide(1079,0));
    }
    @Test
    void divisionInteger_shouldReturnZero_whenGivenDividendZero() throws Exception {
        assertEquals(0, integerDivision.divide(0, 2));
    }
    @Test
    void divisionInteger_shouldReturnInteger_whenGivenNegativeDivide() throws Exception {
        assertThrows(ArithmeticException.class, () -> integerDivision.divide(1079,-4));
    }

    @Test
    void divisionInteger_shouldReturnInteger_whenGivenEvenIntegerAndEvenDivide() throws Exception {
        assertEquals(7, integerDivision.divide(16450, 2350));
    }
    @Test
    void divisionInteger_shouldReturnInteger_whenGivenBigNumbers() throws Exception {
        assertEquals(54833707, integerDivision.divide(164501123, 3));
    }
}
