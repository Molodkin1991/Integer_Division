package com.foxminded.integerdivisione;

public class App {
    public static void main(String[] args) {

        int dividend = 78945;
        int divider = 4;
        IntegerDivisioner integerDivisioner = new IntegerDivisioner();

        integerDivisioner.divide(dividend, divider);
    }
}