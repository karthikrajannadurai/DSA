package org.JavaFeatures;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger_BigDecimal {
    public static void main(String[] args) {

//        Integer to biginteger
        BigInteger big = BigInteger.valueOf(1);
        big = new BigInteger("12");
//        Biginteger to integer
        System.out.println(big.intValue());

//        Float or double to bigDecimal
        BigDecimal bigDecimal = new BigDecimal("12.3");
        System.out.println(bigDecimal.intValue());
        bigDecimal = BigDecimal.valueOf(1.09);

    }
}
