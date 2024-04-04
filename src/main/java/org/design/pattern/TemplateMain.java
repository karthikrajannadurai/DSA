package org.design.pattern;

import org.design.pattern.TemplatePattern.Task;
import org.design.pattern.TemplatePattern.TransferMoneyTask;

public class TemplateMain {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute(); // doExecute will be accessble from same package.
    }
}
