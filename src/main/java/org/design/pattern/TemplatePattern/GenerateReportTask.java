package org.design.pattern.TemplatePattern;


public class GenerateReportTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Generate report");
    }
}
