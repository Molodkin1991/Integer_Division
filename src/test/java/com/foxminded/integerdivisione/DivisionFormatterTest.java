package com.foxminded.integerdivisione;

import org.junit.jupiter.api.Test;

import static com.foxminded.integerdivisione.DivisionFormatter.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionFormatterTest {

    @Test
    void testFormatter() {
        String expectedResult =
                """
                        _78365|5
                         5    |-----
                         --   |15673
                        _28
                         25
                         --
                         _33
                          30
                          --
                          _36
                           35
                           --
                           _15
                            15
                            --
                             0
                             """;
        assertEquals(expectedResult, format(IntegerDivision.divide(78365, 5)));
    }

    @Test
    void testFormatterSecond() {
        String expectedResult =
                """
                        _420|3
                         3  |---
                         -- |140
                        _12
                         12
                         --
                          0
                                    """;
        assertEquals(expectedResult, format(IntegerDivision.divide(420, 3)));
    }
}