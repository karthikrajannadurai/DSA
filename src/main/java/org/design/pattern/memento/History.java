package org.design.pattern.memento;

import java.util.ArrayDeque;
import java.util.Deque;


public class History {

    private Deque<EditorState> content = new ArrayDeque<>();

    public EditorState getEditorState() {
        return content.pop();
    }

    public void setContent(EditorState content) {
        this.content.push(content);
    }

}
