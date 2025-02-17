import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Find the digits in the number and update the frequency array
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            frequency[digit]++;  // Increase the frequency of the digit
            number /= 10;  // Remove the last digit
        }

        // Display the frequency of each digit (0-9)
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
