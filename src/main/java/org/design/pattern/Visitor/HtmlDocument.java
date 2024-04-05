package org.design.pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> htmlNodeList = new ArrayList<>();

    public void addHtmlNode(HtmlNode htmlNode) {
        htmlNodeList.add(htmlNode);
    }

    public void operate(Operation operation) {
        for (HtmlNode htmlNode : htmlNodeList) {
            htmlNode.execute(operation);
        }
    }
}
