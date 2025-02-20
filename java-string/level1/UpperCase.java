import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        System.out.println("Is the text in uppercase? " + compareStrings(text.toUpperCase(), convertToUpperCase(text)));
    }

    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append(Character.toUpperCase(text.charAt(i)));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
