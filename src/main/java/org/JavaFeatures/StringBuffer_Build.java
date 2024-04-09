package org.JavaFeatures;


import java.text.DecimalFormat;

public class StringBuffer_Build {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        // initial 16 capacity
        // inside string buffer using char array operation same as arrayList
        buffer.append("1");
//        buffer.delete(1, 1);
//        buffer.substring(1, 5);

        /**
         Number formatting;
         1. Basic String.format
         2. Big Decimal
         **/
        String str = String.format("%.2f", 0.4555);
        System.out.println(str);

        DecimalFormat decimalFormat = new DecimalFormat("###,####");
        System.out.println(decimalFormat.format(123454332));
    }
}
