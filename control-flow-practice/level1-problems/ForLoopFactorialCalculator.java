import java.util.Scanner;

public class ForLoopFactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        // Check if the number is positive
        if (n < 0) {
            System.out.println("The number " + n + " is not a positive integer.");
        } else {
            // Compute factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}
