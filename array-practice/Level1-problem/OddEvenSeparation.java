import java.util.Scanner;
import java.util.ArrayList;
public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Error: Not a natural number.");
            return;
        }
        ArrayList<Integer> evens = new ArrayList<>(), odds = new ArrayList<>();
        for (int i = 1; i <= number; i++) if (i % 2 == 0) evens.add(i); else odds.add(i);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
        scanner.close();
    }
}
