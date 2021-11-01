package com.foxminded;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerDivisionTests {
    IntegerDivision integerDivision = new IntegerDivision();
    @Test
    void divisionInteger_shouldReturnInteger_whenGivenOddIntegerAndOddDivide() throws Exception {
        assertEquals(5, integerDivision.divide(1079,221));
    }
    @Test
    void divisionInteger_shouldReturnInteger_whenGivenEvenIntegerAndEvenDivide() throws Exception {
        assertEquals(6, integerDivision.divide(16450, 2350));
    }
}
