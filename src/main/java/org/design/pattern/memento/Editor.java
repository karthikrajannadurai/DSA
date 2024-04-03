package org.design.pattern.memento;

public class Editor {

    private String content;

    public Editor() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createEditorState() {
        return new EditorState(content);
    }

    public void restoreEditorState(EditorState state) {
        content = state.getContent();
    }
}
