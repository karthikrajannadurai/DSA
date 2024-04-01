package org.design.pattern.prototype;

import java.util.ArrayList;

public class BookShop implements Cloneable {

    private String name;
    private ArrayList<Book> bookArray = new ArrayList<>();

    public BookShop(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBookArray() {
        return bookArray;
    }

    public void addBookArray(Book book) {
        this.bookArray.add(book);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", bookArray=" + bookArray +
                '}';
    }

    // stimulation of loading data
    public void loadData() {
        for (int index = 0; index <= 10; index++)
            this.addBookArray(new Book(index + ""));
    }

    @Override
    public BookShop clone() {
        //            BookShop clone = (BookShop) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        BookShop cloneBookShop = new BookShop("clone");
        for (Book b : this.bookArray) {
            cloneBookShop.addBookArray(b);
        }

        return cloneBookShop;
    }
}
