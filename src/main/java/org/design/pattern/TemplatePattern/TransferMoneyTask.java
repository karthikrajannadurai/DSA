package org.design.pattern.TemplatePattern;

public class TransferMoneyTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
