package org.design.pattern.Iterator;

public class Main {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("HI");
        history.push("Hello");
        history.push("Heaven");
        history.push("DELL");
        Iterator iter = history.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.current());
        }
    }
}
