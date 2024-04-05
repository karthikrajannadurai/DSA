package org.design.pattern.Mediator.Observer;


public class ArticleMediator {
    private ListBox listBox = new ListBox();
    private SaveButton saveButton = new SaveButton();

    public ArticleMediator() {
        this.listBox.addObserver(this::observer);
    }

    public void interact() {
        listBox.setContent("HI");
    }

    public void observer() {
        System.out.println("observed");
    }
}
