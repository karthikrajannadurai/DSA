package org.design.pattern.Mediator;

public class SaveButton extends UIControl {

    private boolean isEnabled;

    public SaveButton(Mediator mediator) {
        super(mediator);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        System.out.println("enabled");
    }
}
