import javax.swing.*;

public class EvenOddValidator {
    public static void main(String[] args) {
        // Display the initial message
        JOptionPane.showMessageDialog(null, 
            
            "Program uses Java GUI message and input dialogs.\n"
            + "Program evaluates integers as even or odd.\n"
            + "Create by : Jose Mon.\n "
            + "Note: Program *does* perform data validation, prompting user until correct data is entered.",
            "Message", JOptionPane.INFORMATION_MESSAGE);
        
        int number = getValidInteger(); // Function to validate integer input
        
        // Determine even or odd
        String result = (number % 2 == 0) ? number + " is an even number." : number + " is an odd number.";
        
        // Display result
        JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getValidInteger() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Enter integer:", "Number Test Dialog", JOptionPane.QUESTION_MESSAGE);
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operation cancelled.", "Message", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid integer. Please enter integer:", "Number Test Dialog", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
