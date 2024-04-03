package org.design.pattern.command.undoable;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> deque = new ArrayDeque<>();

    public void addHistory(UndoableCommand command) {
        deque.add(command);
    }

    public UndoableCommand removeHistory() {
        return deque.pop();
    }
}
