package org.design.pattern.Mediator.Observer;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
