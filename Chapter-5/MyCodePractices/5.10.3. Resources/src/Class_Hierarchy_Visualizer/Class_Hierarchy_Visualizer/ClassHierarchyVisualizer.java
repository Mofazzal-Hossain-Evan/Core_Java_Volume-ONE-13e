package Class_Hierarchy_Visualizer;

import javax.swing.*; // Swing GUI কম্পোনেন্ট ইম্পোর্ট
import javax.swing.tree.*; // Tree structure support
import java.awt.*; // Layout এবং UI এর জন্য
import java.lang.reflect.*; // Reflection API ব্যবহার করার জন্য

public class ClassHierarchyVisualizer extends JFrame { // JFrame হলো main GUI উইন্ডো

    private final JTextArea detailsArea = new JTextArea(); // ক্লাস ডিটেইল দেখানোর জন্য টেক্সট এরিয়া

    public ClassHierarchyVisualizer() { // কনস্ট্রাক্টর যেখানে GUI তৈরি করা হয়
        setTitle("Class Hierarchy Visualizer"); // উইন্ডোর টাইটেল সেট করা হয়
        setSize(800, 500); // উইন্ডোর সাইজ নির্ধারণ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // উইন্ডো বন্ধ করলে প্রোগ্রামও বন্ধ হবে
        setLocationRelativeTo(null); // স্ক্রিনের মাঝখানে উইন্ডো দেখাবে

        // ইউজারের কাছ থেকে ক্লাস নাম নেয়ার ইনপুট
        String className = JOptionPane.showInputDialog(this, "Enter fully qualified class name:");
        if (className == null || className.isEmpty()) System.exit(0); // যদি কিছু না দেয়, প্রোগ্রাম বন্ধ

        try {
            Class<?> cls = Class.forName(className); // ইউজারের দেওয়া নাম থেকে ক্লাস লোড করা হয়
            DefaultMutableTreeNode root = buildTree(cls); // ক্লাস ট্রি তৈরি করা হয়
            JTree tree = new JTree(root); // JTree তৈরি হয় যাতে হায়ারার্কি দেখানো যায়

            tree.addTreeSelectionListener(e -> { // যখন ইউজার কোনো ক্লাস সিলেক্ট করে
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent(); // নির্বাচিত নোড
                if (selectedNode != null && selectedNode.getUserObject() instanceof Class<?>) {
                    Class<?> selectedClass = (Class<?>) selectedNode.getUserObject(); // ক্লাস অবজেক্ট নেয়া হয়
                    showDetails(selectedClass); // ডিটেইলস দেখানো হয় ডানদিকে
                }
            });

            detailsArea.setEditable(false); // ইউজার যেন লিখতে না পারে
            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                    new JScrollPane(tree), new JScrollPane(detailsArea)); // দুই ভাগে ভাগ করা: ট্রি ও ডিটেইলস
            splitPane.setDividerLocation(300); // ডিভাইডারের পজিশন নির্ধারণ

            add(splitPane); // মেইন উইন্ডোতে যোগ করা হয়
        } catch (ClassNotFoundException e) { // যদি ক্লাস খুঁজে না পাওয়া যায়
            JOptionPane.showMessageDialog(this, "Class not found!", "Error", JOptionPane.ERROR_MESSAGE); // এরর মেসেজ দেখানো হয়
            System.exit(1); // প্রোগ্রাম বন্ধ
        }
    }

    // হায়ারার্কি ট্রি তৈরির জন্য রিকার্সিভ পদ্ধতি
    private DefaultMutableTreeNode buildTree(Class<?> cls) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(cls); // বর্তমান ক্লাসের জন্য একটি নোড তৈরি করি

        Class<?> superCls = cls.getSuperclass(); // সুপারক্লাস পাওয়া যায়
        if (superCls != null) {
            node.add(buildTree(superCls)); // সুপারক্লাসকে রিকার্সিভলি ট্রিতে যোগ করি
        }

        for (Class<?> iface : cls.getInterfaces()) { // সব ইন্টারফেসে লুপ চালাই
            node.add(buildTree(iface)); // প্রতিটি ইন্টারফেস ট্রিতে যোগ করি
        }
        return node; // রুট নোড রিটার্ন করি
    }

    // ক্লাসের ফিল্ড, মেথড, কনস্ট্রাক্টর দেখানোর জন্য
    private void showDetails(Class<?> cls) {
        StringBuilder sb = new StringBuilder(); // ডিটেইল জমিয়ে রাখার জন্য স্ট্রিং বিল্ডার
        sb.append("Class: ").append(cls.getName()).append("\n\n"); // ক্লাসের নাম যোগ করি

        sb.append("Fields:\n"); // ফিল্ড হেডার
        for (Field field : cls.getDeclaredFields()) { // সব ফিল্ডের জন্য লুপ
            sb.append("  ").append(Modifier.toString(field.getModifiers())) // মডিফায়ার (public, private, etc)
                    .append(" ").append(field.getType().getSimpleName()) // টাইপ (int, String, etc)
                    .append(" ").append(field.getName()).append("\n"); // ফিল্ডের নাম
        }

        sb.append("\nMethods:\n"); // মেথড হেডার
        for (Method method : cls.getDeclaredMethods()) { // সব মেথডের জন্য লুপ
            sb.append("  ").append(Modifier.toString(method.getModifiers())) // মডিফায়ার
                    .append(" ").append(method.getReturnType().getSimpleName()) // রিটার্ন টাইপ
                    .append(" ").append(method.getName()).append("("); // মেথড নাম
            Class<?>[] params = method.getParameterTypes(); // প্যারামিটার টাইপ
            for (int i = 0; i < params.length; i++) {
                sb.append(params[i].getSimpleName()); // প্যারামিটার নাম
                if (i < params.length - 1) sb.append(", "); // কমা যোগ করা
            }
            sb.append(")\n"); // বন্ধনী ও নতুন লাইন
        }

        sb.append("\nConstructors:\n"); // কনস্ট্রাক্টর হেডার
        for (Constructor<?> ctor : cls.getDeclaredConstructors()) { // সব কনস্ট্রাক্টরের জন্য লুপ
            sb.append("  ").append(Modifier.toString(ctor.getModifiers())) // মডিফায়ার
                    .append(" ").append(cls.getSimpleName()).append("("); // কনস্ট্রাক্টরের নাম
            Class<?>[] params = ctor.getParameterTypes(); // কনস্ট্রাক্টরের প্যারামিটার টাইপ
            for (int i = 0; i < params.length; i++) {
                sb.append(params[i].getSimpleName()); // প্যারামিটার নাম
                if (i < params.length - 1) sb.append(", "); // কমা
            }
            sb.append(")\n"); // বন্ধনী ও নতুন লাইন
        }

        detailsArea.setText(sb.toString()); // টেক্সট এরিয়ায় রেজাল্ট দেখানো হয়
    }

    public static void main(String[] args) { // মেইন মেথড
        SwingUtilities.invokeLater(() -> new ClassHierarchyVisualizer().setVisible(true)); // GUI শুরু করা হয়
    }
}

