package org.design.pattern.command;

public class Button {

    private Command com;

    public Button(Command com) {
        this.com = com;
    }

    public void click() {
        com.execute();
    }
}
