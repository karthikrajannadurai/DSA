package org.design.pattern.command.undoable;

public class Main {
    public static void main(String[] args) {

        History history = new History();
        DocumentModel documentModel = new DocumentModel("CONTENT");
        BoldCommand bb = new BoldCommand(history, documentModel);
        bb.execute();
        System.out.println(documentModel.getContent());

        new UndoCommand(history).execute();
        System.out.println(documentModel.getContent());
    }
}
