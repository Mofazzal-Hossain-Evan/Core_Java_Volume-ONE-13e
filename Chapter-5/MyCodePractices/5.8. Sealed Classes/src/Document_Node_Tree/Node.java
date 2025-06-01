package Document_Node_Tree;

import java.util.ArrayList;
import java.util.List;

sealed interface Node permits ElementNode, TextNode, CommentNode {
    String render();// Render method: tree থেকে XML/HTML string বানাবে

}

final class TextNode implements Node{
    private final String text;

    public TextNode(String text) {
        this.text = text;
    }
    public String render(){
        return escape(text);
    }

    public String escape(String input){
        return input.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }
}

final class CommentNode implements Node{
    private final String comment;

    public CommentNode(String comment) {
        this.comment = comment;
    }

    public String render(){
       return  "<!-- " + comment + " -->";
    }
}

non-sealed class ElementNode implements Node{
    private final String tagName;
    private final List<Node> children = new ArrayList<>();

    public ElementNode(String tagName) {
        this.tagName = tagName;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public String render(){
        StringBuilder result = new StringBuilder();
        result.append("<").append(tagName).append(">");

        for (Node child : children){
            result.append(child.render());
        }
        result.append("</").append(tagName).append(">");
        return result.toString();
    }
}

