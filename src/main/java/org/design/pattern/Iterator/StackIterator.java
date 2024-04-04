package org.design.pattern.Iterator;

import java.util.ArrayDeque;

public class StackIterator implements Iterator {

    private ArrayDeque<String> arrayStack;

    public StackIterator(ArrayDeque<String> history) {
        arrayStack = history;
    }

    @Override
    public boolean hasNext() {
        return !arrayStack.isEmpty();
    }

    @Override
    public void next() {

    }

    @Override
    public String current() {
        return arrayStack.pop();
    }
}
