package org.dsa.Stack;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ListStack<Integer> stack = new ListStack<>();
        stack.push(12);
        stack.push(23);
        stack.push(30);
        System.out.println(stack.pop());
        stack.printAll();
    }
}
