package org.design.pattern.command.undoable;

public class BoldCommand implements UndoableCommand {

    public BoldCommand(History history, DocumentModel documentModel) {
        this.history = history;
        this.documentModel = documentModel;
    }

    private History history;
    private DocumentModel documentModel;
    private String prevContent;

    @Override
    public void execute() {
        prevContent = documentModel.getContent();
        documentModel.makeBold();
        history.addHistory(this);
    }

    @Override
    public void undo() {
        documentModel.setContent(prevContent);
    }
}
