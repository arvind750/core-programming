import java.util.Scanner;
import java.util.ArrayList;
public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) if (number % i == 0) factors.add(i);
        System.out.println("Factors: " + factors);
        scanner.close();
    }
}
