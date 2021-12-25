package com.foxminded.integerdivisione;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class DivisionFormatter {
    public static String format(DivisionResult divisionResult) {
        List<String> divisionPartsList = divisionResult.getDivisionPartsList();
        String firstSubtractedNumber = String.valueOf(divisionPartsList.get(0));
        int numberOfSpacesInSecondLine = String.valueOf(divisionResult.getDividend()).length() - firstSubtractedNumber.length();


        StringBuilder builder = new StringBuilder();
        builder.append("_").append(divisionResult.getDividend()).append("|").append(divisionResult.getDivisor()).append("\n")
                .append(" ").append(firstSubtractedNumber)
                .append(StringUtils.leftPad("", numberOfSpacesInSecondLine))
                .append("|")
                .append(StringUtils.rightPad("", String.valueOf(divisionResult.getResult()).length(), '-'))
                .append("\n")
                .append(" --")
                .append(StringUtils.leftPad("", String.valueOf(divisionResult.getDividend()).length() - 2))
                .append("|").append(divisionResult.getResult()).append("\n");


        for (int i = 1; i < divisionPartsList.size(); i++) {
            if (i % 2 == 0 || i + 1 == divisionPartsList.size()) {
                builder.append(StringUtils.leftPad("", getNumberOfSpacesBeforeSubtractedNumber(i)));
            } else {
                builder.append(StringUtils.leftPad("_", getNumberOfSpacesBeforeSubtractedNumber(i)));
            }

            builder.append(divisionPartsList.get(i))
                    .append("\n");

            if (i % 2 == 0) {
                builder.append(StringUtils.leftPad(" ", getNumberOfSpacesBeforeSubtractedNumber(i)))
                        .append("--")
                        .append("\n");
            }
        }

        return builder.toString();
    }

    private static int getNumberOfSpacesBeforeSubtractedNumber(int index) {
        return (index + 1) / 2;
    }

}


