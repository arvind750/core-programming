import java.util.Scanner;

public class FORLOOPSumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        // Check if the number is natural (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // sum using formula
            int formulaSum = n * (n + 1) / 2;
            
            // sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations match correctly!");
            } else {
                System.out.println("There is an error in the calculations.");
            }
        }
    }
}
