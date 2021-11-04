package com.foxminded.integerdivisione;

import static com.foxminded.integerdivisione.DivisionResult.divideNext;
import static com.foxminded.integerdivisione.DivisionResult.generateTab;

public class DivisionResultFormatter {
    public int formatter(int dividend, int divider) {
        int maxLen = 1 + Math.max(Integer.valueOf(dividend).toString().length(), Integer.valueOf(divider).toString().length());
        String intFormat = "%" + maxLen + "d";
        System.out.println(" " + String.format(intFormat, dividend) + "|" + String.format(intFormat, divider));
        System.out.println(" " + generateTab(maxLen, ' ') + String.format("|", " "));
        int result = 0;
        while (true) {

            Number num = divideNext(dividend, divider);
            if (num.getDigit() == 0) {
                break;
            }

            String numFormat = "%" + (maxLen - num.getPointPosition()) + "d";
            System.out.println(" " + String.format(numFormat, -divider * num.getDigit()) + generateTab(num.getPointPosition(), ' '));

            result += num.getValue();
            dividend -= num.getValue() * divider;

            System.out.println(generateTab(maxLen + maxLen + 2, '-'));
            System.out.println(" " + String.format(intFormat, dividend));
        }
        System.out.println(generateTab(maxLen + maxLen + 2, '='));
        System.out.println(" " + String.format(intFormat, dividend) + "|" + String.format(intFormat, result));
        return result;
    }
}

