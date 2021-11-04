package com.foxminded.integerDivisione;


public class IntegerDivisioner {
    public static int divide(int dividend, int divider) throws Exception {

        DivisionResult divisionResult = new DivisionResult();
        return divisionResult.divisionResultFormatter(dividend,divider);
    }
}
