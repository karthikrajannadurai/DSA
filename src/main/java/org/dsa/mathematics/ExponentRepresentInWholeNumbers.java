package org.dsa.mathematics;

public class ExponentRepresentInWholeNumbers {
    public static void main(String[] args) {
        exponent(100.00);
    }

    public static void exponent(double str1) {

        String str = String.valueOf(str1);
        int strIndex = 0;
        StringBuilder num = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) != '.') {
                num.append(str.charAt(index));
            } else {
                strIndex = index;
            }
        }
        strIndex = str.length() - strIndex - 1;
        System.out.println(num + " E-" + strIndex);

    }
}
