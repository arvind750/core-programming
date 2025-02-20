import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findFrequency(String text) {
        int[] freq = new int[text.length()];
        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] frequencyResult = findFrequency(text);

        System.out.println("Character Frequencies:");
        for (String freq : frequencyResult) {
            if (freq != null) {
                System.out.println(freq);
            }
        }
    }
}
