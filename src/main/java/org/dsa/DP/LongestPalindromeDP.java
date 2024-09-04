package org.dsa.DP;

public class LongestPalindromeDP {

    public static void main(String[] args) {

        String str = "abaab";
        int l, r, longestPalindromeLength;
        for (int index = 0; index < str.length(); index++) {

            // odd length palindrome
            l = index;
            r = index;
            while (l >= 0 && r < str.length()) {

                if (!(str.charAt(l) == str.charAt(r))) {
                    break;
                }

                longestPalindromeLength = r - l + 1;
                l--;
                r++;
            }

            // even length palindrome
            l = index;
            r = index + 1;
            while (l >= 0 && r <= str.length()) {

                l--;
                r++;
            }
        }
    }
}
