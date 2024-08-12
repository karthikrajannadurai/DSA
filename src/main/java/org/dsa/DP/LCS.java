package org.dsa.DP;

public class LCS {

    public static void main(String[] args) {

        System.out.println(lcs(new int[]{1, 4, 3, 2}, new int[]{1, 2, 3}, 0, 0));
        System.out.println(lcsDp(new int[]{1, 4, 3, 2}, new int[]{1, 2, 3}));

        // note:-- ans+1
    }

    public static int lcs(int[] i1Arr, int[] i2Arr, int i1, int i2) {

        if (i1 >= i1Arr.length || i2 >= i2Arr.length) {
            return 0;
        }
        if (i1Arr[i1] == i2Arr[i2]) {
            // left
            return 1 + lcs(i1Arr, i2Arr, i1 + 1, i2 + 1);
        } else {
            // left // right
            return Math.max(lcs(i1Arr, i2Arr, i1 + 1, i2),
                    lcs(i1Arr, i2Arr, i1, i2 + 1));
        }
    }

    public static int lcsDp(int[] i1, int[] i2) {

        int len;
        int[] arr1, arr2;
        if (i1.length < i2.length) {
            len = i1.length;
            arr1 = i1;
            arr2 = i2;
        } else {
            len = i2.length;
            arr1 = i2;
            arr2 = i1;
        }
        len++;
        int[] previousRow = new int[len];
        int[] currentRow = null;

        for (int row : arr2) {
            currentRow = new int[len];
            for (int col = 1; col <= arr1.length; col++) {

                if (row == arr1[col - 1]) {
                    currentRow[col] = 1 + previousRow[col - 1];
                } else {
                    currentRow[col] = Math.max(previousRow[col], currentRow[col - 1]);
                }
            }
            previousRow = currentRow;
        }
        return currentRow != null ? currentRow[currentRow.length - 1] : 0;
    }
}
