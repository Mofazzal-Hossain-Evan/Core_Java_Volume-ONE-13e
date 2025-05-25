package ObjectFieldEditor;

import javax.swing.*; // Swing UI ক্লাসগুলো
import java.awt.*; // Layout ব্যবহারের জন্য
import java.awt.event.*; // Button event-এর জন্য
import java.lang.reflect.*; // Reflection API

public class ObjectFieldEditor extends JFrame { // মূল Swing ফ্রেম

    private Object currentObject; // ইউজারের দেওয়া অবজেক্ট এখানে থাকবে
    private Field[] fields; // অবজেক্টের ফিল্ডগুলো এখানে থাকবে
    private JTextField[] fieldInputs; // প্রতিটি ফিল্ডের ইনপুট বক্স

    public ObjectFieldEditor(Object obj) {
        this.currentObject = obj; // ইউজার-প্রদত্ত অবজেক্ট সেট করি
        this.fields = obj.getClass().getDeclaredFields(); // সব ফিল্ড নেই
        this.fieldInputs = new JTextField[fields.length]; // ইনপুট বক্স অ্যারে তৈরি

        setTitle("Object Field Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel fieldPanel = new JPanel(new GridLayout(fields.length, 2)); // 2-কলাম লেআউট: FieldName - FieldValue

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // প্রাইভেট ফিল্ডে এক্সেস
            fieldPanel.add(new JLabel(field.getName())); // ফিল্ডের নাম দেখাই

            try {
                Object value = field.get(obj); // ফিল্ডের মান নেই
                JTextField input = new JTextField(value != null ? value.toString() : ""); // ভ্যালু দেখানোর টেক্সটফিল্ড
                fieldInputs[i] = input;
                fieldPanel.add(input); // টেক্সটফিল্ড যোগ করি
            } catch (IllegalAccessException e) {
                fieldPanel.add(new JLabel("Access Denied")); // এক্সেস না পেলে
            }
        }

        JButton updateButton = new JButton("Update Fields"); // আপডেট বাটন
        updateButton.addActionListener(e -> updateFields()); // ক্লিক করলে updateFields() চলবে

        add(fieldPanel, BorderLayout.CENTER); // ফিল্ডপ্যানেল যোগ করি
        add(updateButton, BorderLayout.SOUTH); // বাটন নিচে যোগ করি

        pack(); // UI সাইজ অটো অ্যাডজাস্ট
        setLocationRelativeTo(null); // স্ক্রিনের মাঝখানে
        setVisible(true); // UI দেখানো শুরু
    }

    private void updateFields() {
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String inputValue = fieldInputs[i].getText(); // ইউজারের নতুন ইনপুট
            try {
                Object parsedValue = parseValue(field.getType(), inputValue); // টেক্সট থেকে প্রপার টাইপে কনভার্ট
                field.set(currentObject, parsedValue); // ভ্যালু সেট করি
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error updating field: " + field.getName());
            }
        }

        JOptionPane.showMessageDialog(this, "Fields updated successfully!");
    }

    // String ইনপুটকে আসল টাইপে কনভার্ট করি (int, double, boolean etc)
    private Object parseValue(Class<?> type, String value) {
        if (type == int.class || type == Integer.class) return Integer.parseInt(value);
        if (type == double.class || type == Double.class) return Double.parseDouble(value);
        if (type == boolean.class || type == Boolean.class) return Boolean.parseBoolean(value);
        if (type == String.class) return value;
        // চাইলে আরও টাইপ যোগ করা যাবে
        return null;
    }

    // মেইন মেথড – টেস্ট ক্লাস দিয়ে UI চালাই
    public static void main(String[] args) {
        class Person {
            private String name = "Evan";
            private int age = 22;
        }

        Person p = new Person(); // অবজেক্ট তৈরি
        new ObjectFieldEditor(p); // UI ওপেন
    }
}
