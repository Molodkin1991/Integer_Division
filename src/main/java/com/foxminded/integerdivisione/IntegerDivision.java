package com.foxminded.integerdivisione;


import java.util.ArrayList;
import java.util.List;

public class IntegerDivision {
    public static DivisionResult divide(int dividend,
                                        int divisor) {

        if (0 >= divisor) {
            throw new ArithmeticException();
        }

        List<String> divisionPartsList = new ArrayList<>();
        String dividendString = String.valueOf(dividend);

        String result = "";
        String temp = "";
        int counter = 0;

        for (int i = 0; i < dividendString.length(); i++) {

            temp += dividendString.charAt(i);
            int tempAsInt = Integer.parseInt(temp);
            if (i == 0 && tempAsInt > divisor) {
                divisionPartsList.add(String.valueOf(divisor));
            } else if (tempAsInt > divisor) {
                divisionPartsList.add(String.valueOf(tempAsInt));
            }
            counter = 0;

            while (tempAsInt >= divisor) {
                tempAsInt -= divisor;
                counter += 1;
            }

            if (i != 0 && counter != 0) {
                divisionPartsList.add(String.valueOf(counter * divisor));
            }
            if (i == dividendString.length() - 1) {
                divisionPartsList.add(String.valueOf(tempAsInt));
            }

            temp = String.valueOf(tempAsInt);
            result += String.valueOf(counter);
        }

        return new DivisionResult(dividend, divisor, Integer.parseInt(result), divisionPartsList);
    }

}

