package com.foxminded.integerdivisione;


public class IntegerDivisioner {
    public static int divide(int dividend, int divider) {

        DivisionResult divisionResult = new DivisionResult();
        return divisionResult.divisionResultFormatter(dividend, divider);
    }
}
