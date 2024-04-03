package org.design.pattern.command.undoable;

import org.design.pattern.command.Command;

public interface UndoableCommand extends Command {
    void undo();
}
