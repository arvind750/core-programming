import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) numbers[i] = scanner.nextInt();
        for (int num : numbers) {
            if (num > 0) System.out.println(num + " is positive and " + (num % 2 == 0 ? "even." : "odd."));
            else if (num < 0) System.out.println(num + " is negative.");
            else System.out.println(num + " is zero.");
        }
        System.out.println(numbers[0] == numbers[4] ? "First and last elements are equal."
            : (numbers[0] > numbers[4] ? "First element is greater." : "First element is smaller."));
        scanner.close();
    }
}
