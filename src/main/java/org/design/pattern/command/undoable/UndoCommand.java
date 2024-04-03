package org.design.pattern.command.undoable;

import org.design.pattern.command.Command;

public class UndoCommand implements Command {

    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.removeHistory().undo();
    }
}
