package org.design.pattern.Visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.addHtmlNode(new HeadingNode());
        htmlDocument.addHtmlNode(new AnchorNode());
        htmlDocument.operate(new HighLightOperation());
    }
}
