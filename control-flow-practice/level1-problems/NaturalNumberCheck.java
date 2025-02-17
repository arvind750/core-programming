import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is a natural number
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d%n", number, sum);
        } else {
            System.out.printf("The number %d is not a natural number%n", number);
        }
    }
}
