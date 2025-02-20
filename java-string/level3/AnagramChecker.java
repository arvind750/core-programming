import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (char c : text1.toCharArray()) {
            freq[c]++;
        }

        for (char c : text2.toCharArray()) {
            freq[c]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
