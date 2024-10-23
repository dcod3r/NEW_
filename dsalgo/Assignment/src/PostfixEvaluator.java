import java.util.Stack;
import java.util.Scanner;

public class PostfixEvaluator {
    
    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>(); // Stack to hold operands

        // Split the expression by spaces to handle multi-digit numbers
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // If the token is a number, push it to the stack
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                // Otherwise, the token is an operator
                int b = stack.pop(); // Pop the second operand
                int a = stack.pop(); // Pop the first operand

                // Perform the operation based on the operator
                switch (token.charAt(0)) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        // The final result is the only item remaining in the stack
        return stack.pop();
    }

    // Helper method to check if a string is numeric
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+"); // Matches integers, including negative numbers
    }

    // Main method to test the postfix evaluation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a postfix expression (e.g., '12 5 + 3 *'):");
        String expression = scanner.nextLine();

        try {
            int result = evaluatePostfix(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
