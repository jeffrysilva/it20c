package topic_3_stack_calculator;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Launch the Calculator UI
        SwingUtilities.invokeLater(() -> new CalculatorUI());
    }
}