import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }
        for (int age : ages) {
            if (age < 0) System.out.println("Invalid age entered.");
            else if (age >= 18) System.out.println("The student with the age " + age + " can vote.");
            else System.out.println("The student with the age " + age + " cannot vote.");
        }
        scanner.close();
    }
}
