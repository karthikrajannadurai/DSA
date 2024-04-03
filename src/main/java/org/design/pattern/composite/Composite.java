package org.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;

    List<Component> tree = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com) {

        tree.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component com : tree) {
            com.showPrice();
        }
    }
}
