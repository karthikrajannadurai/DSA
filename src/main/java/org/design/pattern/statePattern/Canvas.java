package org.design.pattern.statePattern;

public class Canvas {

    private Tool tool;

    public Canvas(Tool tool) {
        this.tool = tool;
    }

    public void handle() {
        tool.handle();
    }
}
