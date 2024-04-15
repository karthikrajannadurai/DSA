package org.dsa.StackUsingArray;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;

public class StackUsingArray {
    private Object[] arr;
    private int top = -1;

    public StackUsingArray(int size) {
        this.arr = new Object[size];
    }

    public void push(Object data) {
        if (arr.length-1 == top) {
            grow();
        }
        arr[++top] = data;
    }

    public Object pop() throws SizeLimitExceededException {
        if (top < 0) {
            throw new SizeLimitExceededException();
        }
        Object temp = arr[top];
        arr[top] = null;
        top--;
        return temp;
    }

    public void printAll() {
        if (top < 0) {
            return;
        }
        while (top >= 0) {
            System.out.print(arr[top] + " ");
            top--;
        }
    }

    public void grow() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
}
