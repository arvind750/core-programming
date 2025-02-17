import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        // Check if the number is natural (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            //sum using formula
            int formulaSum = n * (n + 1) / 2;
            
            //sum using while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations match correctly!");
            } else {
                System.out.println("There is an error in the calculations.");
            }
        }
    }
}
