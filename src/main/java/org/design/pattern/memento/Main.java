package org.design.pattern.memento;

public class Main {
    public static void main(String[] args) {

        Editor ed = new Editor();
        History his = new History();
        ed.setContent("a");
        his.setContent(ed.createEditorState());
        ed.setContent("b");
        his.setContent(ed.createEditorState());
        ed.restoreEditorState(his.getEditorState());
        System.out.println(ed.getContent());

        ed.restoreEditorState(his.getEditorState());
        System.out.println(ed.getContent());
    }
}
