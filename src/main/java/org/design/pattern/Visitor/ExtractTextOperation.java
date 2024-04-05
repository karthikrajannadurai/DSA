package org.design.pattern.Visitor;

public class ExtractTextOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Extract operation done on heading node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("extract operation done on anchor node");
    }
}
