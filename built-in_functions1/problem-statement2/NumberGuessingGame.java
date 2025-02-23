import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        System.out.println("Think of a number from 1-100, and i will guess the number!: ");

        while (true) {
            // Ensure the range is valid before making a guess
            if (low > high) {
                System.out.println("Error: Invalid range. The game might have received incorrect input.");
                break; // Exit the loop to prevent further errors
            }
             // Generate a random guess within the current bounds
            guess = generateGuess(low, high, random);
            System.out.println("Is you number: " + guess + " ? (Enter-->high,low,or correct)");
            feedback = sc.next().toLowerCase();
             // Check user feedback and adjust bounds accordingly
            if (feedback.equals("correct")) {
                System.out.println("Hah! wegessed it right!!(❁´◡`❁)");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        sc.close();
    }

    private static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}
