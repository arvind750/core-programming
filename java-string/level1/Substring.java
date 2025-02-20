import java.util.Scanner;

public class Substring {

    public static String createSubString(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareSubstrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = s.nextLine();

        System.out.print("Enter start index: ");
        int start = s.nextInt();

        System.out.print("Enter end index: ");
        int end = s.nextInt();

        String subStringCharAt = createSubString(text, start, end);
        String subStringBuiltIn = text.substring(start, end);
        boolean areEqual = compareSubstrings(subStringCharAt, subStringBuiltIn);

        System.out.println("Substring using charAt(): " + subStringCharAt);
        System.out.println("Substring using built-in method: " + subStringBuiltIn);
        System.out.println("Are both substrings equal: " + areEqual);
    }
}
