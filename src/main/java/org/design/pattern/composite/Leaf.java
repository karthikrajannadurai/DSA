package org.design.pattern.composite;

public class Leaf implements Component {

    int price;
    String name;

    public Leaf(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " " + price);
    }
}
