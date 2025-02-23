import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking an integer input
        System.out.println("Enter a number to check if it's prime:");
        int num = scanner.nextInt();
        
        // Checking if the number is prime
        boolean isPrime = checkPrime(num);
        
        // Displaying the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
    
    // Method to check if a number is prime
    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
