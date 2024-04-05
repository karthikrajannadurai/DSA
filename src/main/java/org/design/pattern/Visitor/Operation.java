package org.design.pattern.Visitor;

public interface Operation {
    void apply(HeadingNode headingNode);

    void apply(AnchorNode anchorNode);
}
