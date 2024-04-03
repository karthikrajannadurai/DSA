package org.design.pattern.command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("BlackAndWhite");
    }
}
