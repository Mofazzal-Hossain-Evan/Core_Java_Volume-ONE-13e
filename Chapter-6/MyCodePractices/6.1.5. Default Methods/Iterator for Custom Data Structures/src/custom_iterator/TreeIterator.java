package custom_iterator;

import java.util.Stack;

public class TreeIterator<T> implements MyIterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();

    public TreeIterator(TreeNode<T> root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        TreeNode<T> node = stack.pop();
        if (node.right != null) {
            pushLeft(node.right);
        }
        return node.value;
    }
    // remove() ওভাররাইড করিনি, তাই ডিফল্ট UnsupportedOperationException চলবে
}
