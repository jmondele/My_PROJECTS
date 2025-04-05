import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {
    private JList<String> leftList;
    private JList<String> rightList;
    private JButton copyButton;
    private DefaultListModel<String> rightListModel;

    // List of professions
    private static final String[] professions = {
            "Jose Mon ,IT", "Doctor", "Teacher", "Pilot",
            "Architect", "Graphic Designer", "Police Officer",
            "Firefighter", "Lawyer", "Electrician"
    };

    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        // Left List (Multiple Selection)
        leftList = new JList<>(professions);
        leftList.setVisibleRowCount(5); 
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        // Copy Button
        copyButton = new JButton("Copy >>>");
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copySelectedItems();
            }
        });
        add(copyButton);

        // Right List (Single Selection)
        rightListModel = new DefaultListModel<>();
        rightList = new JList<>(rightListModel);
        rightList.setVisibleRowCount(5);
        rightList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));
    }

    private void copySelectedItems() {
        // Get selected values from left list
        java.util.List<String> selectedValues = leftList.getSelectedValuesList();

        // Add selected items to right list
        rightListModel.clear();
        for (String item : selectedValues) {
            rightListModel.addElement(item);
        }
    }
}
