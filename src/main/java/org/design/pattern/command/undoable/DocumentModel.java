package org.design.pattern.command.undoable;

public class DocumentModel {

    public DocumentModel(String content) {
        this.content = content;
    }

    String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void makeBold() {
        content = "<b>" + content + "<\\b>";
    }
}
