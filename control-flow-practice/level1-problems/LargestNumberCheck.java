import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
        // Check which number is the largest
        boolean isFirstLargest = (number1 > number2 && number1 > number3);
        boolean isSecondLargest = (number2 > number1 && number2 > number3);
        boolean isThirdLargest = (number3 > number1 && number3 > number2);
        
        // Display results
        System.out.printf("Is the first number the largest? %b%n", isFirstLargest);
        System.out.printf("Is the second number the largest? %b%n", isSecondLargest);
        System.out.printf("Is the third number the largest? %b%n", isThirdLargest);
        
    }
}
