package org.design.pattern.Mediator;

public class ArticleMediator implements Mediator {

    private ListBox listBox = new ListBox(this);
    private SaveButton saveButton = new SaveButton(this);

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == listBox) {
            saveButton.setEnabled(true);
        }
    }

    public void interact() {
        listBox.setContent("HI");
    }
}
