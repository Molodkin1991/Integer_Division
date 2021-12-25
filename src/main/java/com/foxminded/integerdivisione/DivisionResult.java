package com.foxminded.integerdivisione;

import java.util.List;

public class DivisionResult {
    private int dividend;
    private int divisor;
    private int result;
    private List<String> divisionPartsList;


    public DivisionResult(int dividend, int divisor, int result, List<String> divisionPartsList) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.result = result;
        this.divisionPartsList = divisionPartsList;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<String> getDivisionPartsList() {
        return divisionPartsList;
    }

    public void setDivisionPartsList(List<String> divisionPartsList) {
        this.divisionPartsList = divisionPartsList;
    }
}
