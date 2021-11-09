package com.foxminded.integerdivisione;

public class DivisionFormatter {
    public DivisionResult formatter(int dividend, int divider) {
        DivisionResult divisionResult = new DivisionResult();
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
        divisionResult.setResult(result);
        return divisionResult;
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

