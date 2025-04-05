import javax.swing.*;

public class PaintCostCalculator {
    public static void main(String[] args) {
        // Display initial information message
        JOptionPane.showMessageDialog(null,
                "Program uses Java GUI message and input dialogs.\n"
                        + "Create by : Jose Mon.\n "
                        + "This program calculates paint cost based on area and price per gallon.\n"
                        + "Validation is performed to ensure only numbers are entered.",
                "Message", JOptionPane.INFORMATION_MESSAGE);

        // Get valid user inputs
        double paintPrice = getValidDouble("Paint price per gallon:");
        double length = getValidDouble("Room/house length:");
        double width = getValidDouble("Room/house width:");
        double height = getValidDouble("Room/house height:");

        // Calculate area and total cost
        double area = 2 * (length * height + width * height);
        double totalCost = paintPrice * (area / 350); // Assuming 1 gallon covers 350 sq. ft.

        // Display result
        String resultMessage = String.format("Paint = $%.2f per gallon.\n"
                        + "Area of room/house = %.2f sq. ft.\n"
                        + "Total = $%.2f",
                paintPrice, area, totalCost);

        JOptionPane.showMessageDialog(null, resultMessage, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to get a valid double input
    public static double getValidDouble(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, prompt, "Paint Cost Calculator", JOptionPane.QUESTION_MESSAGE);
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operation cancelled.", "Message", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            try {
                double value = Double.parseDouble(input);
                if (value <= 0) {
                    JOptionPane.showMessageDialog(null, "Not a valid value. " + prompt, "Paint Cost Calculator", JOptionPane.ERROR_MESSAGE);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not a valid value. " + prompt, "Paint Cost Calculator", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
