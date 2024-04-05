package org.design.pattern.Mediator.Observer;

public class ListBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObserver();
    }
}