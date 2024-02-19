package org.dsa.mathematics;

public class FindPositionOfRightSetBit {
    public static void main(String[] args) {
        int n = 34;
        if(n!=0)
        System.out.println(Math.log10((n&(-n)))/Math.log10(2)+1);
    }
}
