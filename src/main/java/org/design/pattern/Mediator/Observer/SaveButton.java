package org.design.pattern.Mediator.Observer;

public class SaveButton extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyObserver();
    }
}
