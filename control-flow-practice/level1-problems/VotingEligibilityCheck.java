import java.util.Scanner;

public class VotingEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        // Check voting eligibility
        if (age >= 18) {
            System.out.printf("The person's age is %d and can vote.%n", age);
        } else {
            System.out.printf("The person's age is %d and cannot vote.%n", age);
        }
    }
}
