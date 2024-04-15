package org.dsa.StackUsingList;

public class Main {
    public static void main(String[] args) {

        ListStack<Integer> stack = new ListStack<>();
        stack.push(12);
        stack.push(23);
        stack.push(30);
        System.out.println(stack.pop());
        stack.printAll();

        // reverse string using stack
        ListStack<Character> str = new ListStack<>();
        String reverseStr = "ABCD";
        for (int index = 0; index < reverseStr.length(); index++) {

            str.push(reverseStr.charAt(index));
        }
        str.printAll();
    }
}
