package org.design.pattern.command;

public class Main {
    public static void main(String[] args) {

        Button b = new Button(new AddCustomerCommand(new CustomerService()));
        b.click();

        CompositeComponent cc = new CompositeComponent();
        cc.addCommands(new BlackAndWhiteCommand());
        cc.addCommands(new ResizeCommand());
        cc.execute();
    }
}
