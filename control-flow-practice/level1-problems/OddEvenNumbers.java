import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check if the number is positive
        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            System.out.println("Odd and Even numbers between 1 and " + number + ":");
            
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
    }
}
