package org.design.pattern.statePattern;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(new SelectionTool());
        canvas.handle();
    }
}
