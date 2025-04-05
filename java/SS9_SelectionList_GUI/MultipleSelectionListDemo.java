import javax.swing.*;

public class MultipleSelectionListDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MultipleSelectionFrame frame = new MultipleSelectionFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(350, 200);
                frame.setVisible(true);
            }
        });
    }
}
