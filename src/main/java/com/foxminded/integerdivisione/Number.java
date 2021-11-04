package com.foxminded.integerdivisione;

public class Number {

    private final int digit;
    private final int pointPosition;

    public Number(int value, int pointPosition) {
        this.digit = value;
        this.pointPosition = pointPosition;
    }

    public int getDigit() {
        return digit;
    }

    public int getPointPosition() {
        return pointPosition;
    }

    public int getValue() {
        int result = digit;
        for (int i = 0; i < pointPosition; i++) {
            result *= 10;
        }
        return result;
    }
}