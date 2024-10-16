package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {
    private JFrame frame;
    private JTextField display;
    private Calculator calculator;
    private StringBuilder input;

    public CalculatorUI() {
        calculator = new Calculator();
        input = new StringBuilder();
        initializeUI();
    }

    // Initialize the graphical user interface
    private void initializeUI() {
        frame = new JFrame("Stack-Based Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        // Display area
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(display, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Buttons for 0-9, +, -, *, /, C (Clear), and = (equals)
        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "C", "=", "/"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 25));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Handle button click events
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("\\d")) {
                // Append number to input
                input.append(command);
                display.setText(input.toString());
            } else if (command.equals("C")) {
                // Clear input and calculator stack
                calculator.clear();
                input.setLength(0);
                display.setText("");
            } else if (command.equals("=")) {
                // Perform the calculation
                if (input.length() > 0) {
                    calculator.push(Double.parseDouble(input.toString()));
                }
                display.setText(Double.toString(calculator.getResult()));
                input.setLength(0); // Clear input after calculation
            } else {
                // Handle operator
                if (input.length() > 0) {
                    calculator.push(Double.parseDouble(input.toString()));
                    input.setLength(0);
                }
                calculator.performOperation(command.charAt(0));
                display.setText(Double.toString(calculator.getResult()));
            }
        }
    }
}