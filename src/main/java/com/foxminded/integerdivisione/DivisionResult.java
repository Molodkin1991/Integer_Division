package com.foxminded.integerdivisione;

public class DivisionResult {
    public int divisionResultFormatter(int dividend, int divider) {
        DivisionResultFormatter resultFormatter = new DivisionResultFormatter();
        if (0 >= divider) {
            throw new ArithmeticException();
        }
        return resultFormatter.formatter(dividend, divider);
    }

    public static String generateTab(int length, char ch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(ch);
        }
        return result.toString();
    }

    public static Number divideNext(int dividend, int divider) {
        int pointPosition = 0;
        if (dividend < divider) {
            return new Number(0, 0);
        }
        while (dividend > divider * 10) {
            pointPosition++;
            divider *= 10;
        }
        int count = 1;
        while (dividend > divider * (count + 1)) {
            count++;
        }
        return new Number(count, pointPosition);
    }
}
