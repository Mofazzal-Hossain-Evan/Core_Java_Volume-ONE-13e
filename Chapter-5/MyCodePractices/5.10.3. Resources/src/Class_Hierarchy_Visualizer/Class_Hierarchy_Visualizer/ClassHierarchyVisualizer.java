package Class_Hierarchy_Visualizer;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ClassHierarchyVisualizer extends JFrame {

    private final JTextArea detailsArea = new JTextArea();

    public ClassHierarchyVisualizer() {

        setTitle("Class Hierarchy VSL");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ইউজারের কাছ থেকে ক্লাস নাম নেয়ার ইনপুট
        String className = JOptionPane.showInputDialog(this,"Enter fully qualified class name:" );
        if (className ==  null || className.isEmpty()) System.exit(1);

        try{
            Class<?>  cls = Class.forName(className); // ক্লাস লোড করা হয়
            DefaultMutableTreeNode root = buildTree(cls); // ট্রি তৈরি করা হয়
            JTree tree = new JTree(root); // JTree তৈরি হয় যাতে হায়ারার্কি দেখানো যায়

            tree.addTreeSelectionListener(e -> {  // যখন ইউজার কোনো ক্লাস সিলেক্ট করে
                DefaultMutableTreeNode selectNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent() // নির্বাচিত নোড
            if(selectNode != null && selectNode.getUserObject() instanceof Class<?>) {
                Class<?> selectedClass = (Class<?>) selectNode.getUserObject(); // ক্লাস অবজেক্ট নেয়া হয়

                showDetails(selectedClass);  // ডিটেইলস দেখানো হয় ডানদিকে

            }
            });
            detailsArea.setEditable(false);
            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                    new JScrollPane(tree),
                    new JScrollPane(detailsArea));
            splitPane.showMessageDialog(this, "Class not found!", "Error", JOptionPane.ERROR_MESSAGE); // এরর মেসেজ দেখানো হয়
            System.exit(1); // প্রোগ্রাম বন্ধ

        }
    }

    // হায়ারার্কি ট্রি তৈরির জন্য রিকার্সিভ পদ্ধতি
    private DefaultMutableTreeNode buildTree(Class<?> cls){
        DefaultMutableTreeNode node  = new DefaultMutableTreeNode(cls);

        Class<?> superCls = cls.getClass();
        if (superCls != null) {
            node.add(buildTree(iface));
        }
        return node;
    }
    // ক্লাসের ফিল্ড, মেথড, কনস্ট্রাক্টর দেখানোর জন্য
    private void showDetails(Class<?> cls){
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(cls.getName()).append("\n\n");
        sb.append("Fields:\n");
        for (Field field : cls.getDeclaredFields()){
            sb.append(" ").append(Modifier.toString(field.getModifiers()))
                    .append(" ").append(field.getType().getSimpleName())
                    .append(" ").append(field.getName()).append("\n");
        }

        sb.append("\nMethods:\n");
        for (Method method : cls.getDeclaredFields()){
            sb.append(" ").append(Modifier.toString(method.getModifiers()))
                    .append(" ").append(method.getReturnType().getSimpleName())
                    .append(" ").append(method.getName()).append("(");
            Class<?>[]
        }
    }

}
