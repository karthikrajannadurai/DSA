package org.design.pattern.composite;

public class Main {
    public static void main(String[] args) {

        Component ram = new Leaf("ram", 5000);
        Component mouse = new Leaf("mouse", 500);
        Component motherboard = new Leaf("MotherBoard", 4000);

        Composite peri = new Composite("Peri");
        peri.addComponent(ram);
        peri.addComponent(motherboard);
        peri.addComponent(mouse);
        peri.showPrice();
    }
}
