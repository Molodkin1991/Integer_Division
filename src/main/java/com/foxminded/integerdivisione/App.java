package com.foxminded.integerdivisione;

public class App {
    public static void main(String[] args) {

        DivisionResult divisionResult = IntegerDivision.divide(78945, 4);

        System.out.println(DivisionFormatter.format(divisionResult));

    }
}