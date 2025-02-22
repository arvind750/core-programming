import java.util.Scanner;

public class Duplicate_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Check if the character is not already in the result string
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i); // Add it to the result string if it's not a duplicate
            }
        }

        System.out.println("Modified string: " + result);
    }
}