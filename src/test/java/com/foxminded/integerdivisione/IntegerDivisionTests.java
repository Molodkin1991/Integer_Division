package com.foxminded.integerdivisione;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void divisionInteger_shouldReturnInteger_whenGivenDivide() throws Exception {
        List<String> testList = new ArrayList(Arrays.asList("4", "9", "8", "15", "12", "30", "28", "2"));
        List<String> testList2 = new ArrayList(Arrays.asList("120", "120", "0"));

        assertEquals(new DivisionResult(8950, 4, 2237, testList), IntegerDivision.divide(8950, 4));
        assertEquals(new DivisionResult(120, 15, 8, testList2), IntegerDivision.divide(120, 15));

    }


}
