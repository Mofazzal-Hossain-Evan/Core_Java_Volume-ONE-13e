package custom_iterator;

public class Main {
    public static void main(String[] args) {
        // ----- ArrayIterator টেস্ট -----
        String[] names = {"A", "B", "C", "D"};
        ArrayIterator<String> arrayIterator = new ArrayIterator<>(names);

        System.out.println("Initial array: " + arrayIterator);
        while (arrayIterator.hasNext()) {
            String item = arrayIterator.next();
            System.out.println("Visited: " + item);
            if ("B".equals(item)) {
                arrayIterator.remove(); // B রিমুভ হবে
            }
        }
        System.out.println("After removal: " + arrayIterator);

        // ----- skip() মেথড টেস্ট -----
        arrayIterator = new ArrayIterator<>(new String[]{"X", "Y", "Z"});
        arrayIterator.skip(1); // প্রথম এলিমেন্ট স্কিপ
        while (arrayIterator.hasNext()) {
            System.out.println("Skipped iterator visit: " + arrayIterator.next());
        }

        // ----- TreeIterator টেস্ট -----
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);

        TreeIterator<Integer> treeIterator = new TreeIterator<>(root);
        while (treeIterator.hasNext()) {
            Integer val = treeIterator.next();
            System.out.println("Tree node visited: " + val);
            if (val == 2) {
                try {
                    treeIterator.remove(); // ডিফল্ট মেথড কল হবে -> এক্সসেপশন
                } catch (UnsupportedOperationException e) {
                    System.out.println("TreeIterator remove() not supported!");
                }
            }
        }
    }
}
