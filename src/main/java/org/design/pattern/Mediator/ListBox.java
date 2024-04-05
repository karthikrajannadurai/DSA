package org.design.pattern.Mediator;

public class ListBox extends UIControl {

    private String content;

    public ListBox(Mediator mediator) {
        super(mediator);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        mediator.changed(this);
    }
}
