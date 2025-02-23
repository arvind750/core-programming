import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();

        // Calculating factorial using recursion
        long factorial = calculateFactorial(num);

        // Displaying the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }

    // Recursive function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: Factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
}
