package com.foxminded;


import java.math.BigInteger;

public class IntegerDivision {

    public String divide (String a, String b){
        BigInteger integer =new BigInteger(String.valueOf(a));
        BigInteger divider =new BigInteger(String.valueOf(b));
        BigInteger result = integer.divide(divider);
        return String.valueOf(result);

    }
}
