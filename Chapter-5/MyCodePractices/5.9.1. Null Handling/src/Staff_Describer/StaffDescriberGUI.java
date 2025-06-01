package Staff_Describer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StaffDescriberGUI {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(() -> new StaffDescriberGUI().createAndShowGUI());
    }

    private final Staff[] staffList = {new Teacher("Mathematics"),
            new Janitor(),
            new Visitor("Seminar"),
            null
    };

    private void createAndShowGUI(){
        JFrame frame = new JFrame("Staff Describer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(390, 300);

        String[] displayName = {
                "Teacher: Mathematics",
                "Janitor",
                "Visitor: Seminar",
                "No Staff (null)"
        };

        JList<String> list = new JList<>(displayName);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroll = new JScrollPane(list);

        JTextArea descriptionArea = new JTextArea();
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);

        JButton describeButton = new JButton("Describe Staff");
        describeButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex == -1) {
                descriptionArea.setText("❗ Please select a staff member.");
                return;
            }
            Staff selectedStaff = staffList[selectedIndex];
            String result = switch (selectedStaff) {
                case null -> "🚫 No staff present!";
                default -> selectedStaff.describeSelf();

            };
            descriptionArea.setText(result);

        } );

        frame.setLayout(new BorderLayout());
        frame.add(listScroll, BorderLayout.NORTH);
        frame.add(describeButton, BorderLayout.CENTER);
        frame.add(new JScrollPane(descriptionArea), BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
