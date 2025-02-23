import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking three integer inputs
        System.out.println("Enter three numbers:");
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);
        int num3 = getInput(scanner);
        
        // Finding the maximum
        int max = findMax(num1, num2, num3);
        
        // Displaying the result
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
    
    // Method to take input from the user
    private static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    
    // Method to find the maximum of three numbers
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

