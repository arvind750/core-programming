import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Store the digits of the number in an array
        int tempNumber = number;
        int count = 0;
        
        // Find the count of digits in the number
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Fill the array with digits from the number
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  // Get the last digit
            tempNumber /= 10;             // Remove the last digit
        }

        // Display the array in reverse order (which is already in reverse)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(); // For a new line after displaying the reversed number
    
    }
}
