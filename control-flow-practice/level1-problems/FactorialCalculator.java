import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        // Check if the number is positive
        if (n < 0) {
            System.out.println("The number " + n + " is not a positive integer.");
        } else {
            // factorial using while loop
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}
