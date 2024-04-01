package org.design.pattern.prototype;

public class Main {
    public static void main(String[] args) {

        BookShop bs1 = new BookShop("A1");
        bs1.loadData();
        System.out.println(bs1);
        BookShop bs2 = bs1.clone();
        // first level cloning
        System.out.println("First level cloning---");
        bs2.setName("A2");
        System.out.println(bs1);
        System.out.println(bs2);

        // second level cloning with no custom clone
        System.out.println("second level cloning---");
        bs1.getBookArray().remove(2);
        System.out.println(bs1);
        System.out.println(bs2);

        // deeplevel cloning
        System.out.println("DeepLevel cloning ----");
        BookShop bs3 = bs1.clone();
        bs1.getBookArray().remove(2);
        System.out.println(bs1);
        System.out.println(bs3);
    }
}
