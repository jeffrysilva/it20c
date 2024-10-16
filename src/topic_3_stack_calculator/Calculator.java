package topic_3_stack_calculator;

import java.util.Stack;

public class Calculator {
    private Stack<Double> stack;

    public Calculator() {
        stack = new Stack<>();
    }

    // Push a number onto the stack
    public void push(double value) {
        stack.push(value);
    }

    // Pop a number from the stack
    public double pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return 0.0;
    }

    // Perform the operation on the top two numbers in the stack
    public void performOperation(char operator) {
        if (stack.size() < 2) {
            System.out.println("Not enough values in the stack to perform the operation");
            return;
        }

        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = 0.0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    stack.push(operand1); // Push back the operands if there's an error
                    stack.push(operand2);
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Unknown operator");
                stack.push(operand1); // Push back the operands if there's an error
                stack.push(operand2);
                return;
        }

        stack.push(result); // Push the result back onto the stack
    }

    // Get the current top of the stack (result)
    public double getResult() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return 0.0;
    }

    // Clear the stack
    public void clear() {
        stack.clear();
    }
}