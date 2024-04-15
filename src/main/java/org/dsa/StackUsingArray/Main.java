package org.dsa.StackUsingArray;

import javax.naming.SizeLimitExceededException;

public class Main {
    public static void main(String[] args) throws SizeLimitExceededException {

        StackUsingArray sc = new StackUsingArray(2);
        sc.push(12);
        sc.push(121);
        sc.push(123);
        sc.pop();
        sc.pop();
        sc.pop();
        sc.printAll();
    }
}
