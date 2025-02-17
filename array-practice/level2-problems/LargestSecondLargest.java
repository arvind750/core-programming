import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Define variables
        int number, maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        int largest = -1, secondLargest = -1;

        // Take input from the user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Extract digits and store them in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;         // Remove the last digit
            index++;
        }

        // Find the largest and second largest number
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        
    }
}
