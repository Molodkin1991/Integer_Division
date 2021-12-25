package com.foxminded.integerdivisione;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerDivisionTests {
    IntegerDivision integerDivision = new IntegerDivision();

    @Test
    void divisionInteger_shouldReturnInteger_whenGivenZeroDivide() throws Exception {
        assertThrows(ArithmeticException.class, () -> integerDivision.divide(1079, 0));
    }

    @Test
    void divisionInteger_shouldReturnInteger_whenGivenNegativeDivide() throws Exception {
        assertThrows(ArithmeticException.class, () -> integerDivision.divide(1079, -4));
    }
}
