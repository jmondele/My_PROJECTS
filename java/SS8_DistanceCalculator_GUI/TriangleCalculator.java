import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleCalculator extends JFrame {
    private JTextField legAField, legBField, resultField;
    private JButton computeButton;

    public TriangleCalculator() {
        setTitle("Triangle Hypotenuse Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create UI components
        JLabel legALabel = new JLabel("Leg A:");
        legAField = new JTextField();

        JLabel legBLabel = new JLabel("Leg B:");
        legBField = new JTextField();

        JLabel resultLabel = new JLabel("Hypotenuse C:");
        resultField = new JTextField();
        resultField.setEditable(false);

        computeButton = new JButton("Compute");
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeHypotenuse();
            }
        });

        // Add components to frame
        add(legALabel);
        add(legAField);
        add(legBLabel);
        add(legBField);
        add(resultLabel);
        add(resultField);
        add(computeButton);

        setVisible(true);
    }

    private void computeHypotenuse() {
        try {
            double a = Double.parseDouble(legAField.getText());
            double b = Double.parseDouble(legBField.getText());

            if (a <= 0 || b <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter positive values for A and B.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            resultField.setText(String.format("%.2f", c)); // Format to 2 decimal places

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TriangleCalculator();
    }
}
