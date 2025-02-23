import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
    
    // Function for addition
    private static double add(double a, double b) {
        return a + b;
    }
    
    // Function for subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }
    
    // Function for multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }
    
    // Function for division
    private static double divide(double a, double b) {
        return a / b;
    }
}
