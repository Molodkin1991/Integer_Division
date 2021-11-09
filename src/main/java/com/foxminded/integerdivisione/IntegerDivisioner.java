package com.foxminded.integerdivisione;


public class IntegerDivisioner {
    public static DivisionResult divide(int dividend, int divider) {

        DivisionFormatter resultFormatter = new DivisionFormatter();
        if (0 >= divider) {
            throw new ArithmeticException();
        }
        return resultFormatter.formatter(dividend, divider);
    }
}
