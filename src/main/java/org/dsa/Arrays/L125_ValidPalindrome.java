package org.dsa.Arrays;

public class L125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (!checkAlpha(s.charAt(i)) && i < j) {
                i++;
            }
            while (!checkAlpha(s.charAt(j)) && i < j) {
                j--;
            }
            if (toLowerCase(s.charAt(i)) != toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static char toLowerCase(char s) {
        if (s >= 'A' && s <= 'Z') {
            return (char) (s + 32);
        }
        return s;
    }

    public static boolean checkAlpha(char i) {
        if (i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z' || i >= '0' && i <= '9') {
            return true;
        }
        return false;
    }
}