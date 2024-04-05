package org.design.pattern.Visitor;

public class HighLightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight operation done heading node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("highlight operation done anchor node");
    }
}
