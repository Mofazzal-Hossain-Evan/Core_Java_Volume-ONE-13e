package Document_Node_Tree;

public class NodeTreeTest{
    public static void main(String[] args) {
        // Root element
        ElementNode root = new ElementNode("html");

        // Head section
        ElementNode head = new ElementNode("head");
        head.addChild(new ElementNode("title"));
        head.addChild(new ElementNode("This is a comment inside head"));

        // Body section
        ElementNode body = new ElementNode("body");
        body.addChild(new TextNode("Hello world"));
        body.addChild(new CommentNode("End of the body"));


        //build full tree
        root.addChild(head);
        root.addChild(body);

        //Render whole document
        String output = root.render();
        System.out.println(output);

    }
}
