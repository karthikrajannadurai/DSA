package org.dsa.mathematics;


// this logic will work only for two repeating numbers, like -2,2
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,3,4};
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        System.out.println(unique);
    }
}
