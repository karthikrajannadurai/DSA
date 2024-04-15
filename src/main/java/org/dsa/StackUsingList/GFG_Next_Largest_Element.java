package org.dsa.StackUsingList;

import java.util.Arrays;
import java.util.Stack;

public class GFG_Next_Largest_Element {

    public static void main(String[] args) {


    }

    public long[] nextLargestElement(long[] arr, int n) {

        Stack<Long> stack = new Stack<>();
        long[] ans = new long[n];
        for (int index = n - 1; index >= 0; index--) {

            while (!stack.isEmpty() && stack.peek() <= arr[index]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[index] = -1;
            } else {
                ans[index] = stack.peek();
            }
            stack.push(arr[index]);
        }
        return ans;
    }
}
