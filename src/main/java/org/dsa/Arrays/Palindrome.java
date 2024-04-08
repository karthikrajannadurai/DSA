package org.dsa.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("abpba"));
    }

    public static int palindrome(String str) {
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
