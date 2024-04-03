package org.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Command {

    List<Command> commandList = new ArrayList<>();

    public void addCommands(Command c) {
        commandList.add(c);
    }

    @Override
    public void execute() {
        for (Command c : commandList) {
            c.execute();
        }
    }
}
