package org.design.pattern.Mediator;

public class UIControl {
    protected Mediator mediator;

    public UIControl(Mediator mediator) {
        this.mediator = mediator;
    }
}
