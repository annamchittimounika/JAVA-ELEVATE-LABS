import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("===== Java Console Calculator =====");

        while (keepRunning) {
            // Input numbers
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            // Perform operation based on user input
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, *, or /.");
            }

            // Ask user if they want to continue
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                keepRunning = false;
                System.out.println("Calculator exited. Goodbye!");
            }
        }

        scanner.close();
    }
}
