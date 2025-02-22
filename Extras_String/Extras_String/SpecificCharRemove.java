import java.util.Scanner;

public class SpecificCharRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter a character to remove: ");
        char ch = sc.next().charAt(0); // Read the first character of the input string

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i); // Append the character to the result
            }
        }

        System.out.println("Modified string: " + result);
    }
}
