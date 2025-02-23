import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculating GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Displaying the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Function to calculate GCD using the Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
