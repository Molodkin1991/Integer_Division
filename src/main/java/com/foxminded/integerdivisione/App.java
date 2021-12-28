package com.foxminded.integerdivisione;

public class App {
    public static void main(String[] args) {

        DivisionResult divisionResult = IntegerDivision.divide(85678, 3);
        System.out.println(DivisionFormatter.format(divisionResult));

    }
}