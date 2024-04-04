package org.design.pattern.Iterator;

import java.util.ArrayDeque;

public class BrowserHistory {

    private final ArrayDeque<String> history = new ArrayDeque<>();

    public void push(String history) {
        this.history.add(history);
    }

    public String pop() {
        return history.pop();
    }

    public Iterator getIterator() {
        return new StackIterator(this.history);
    }
}
