import java.util.Scanner;

public class ShortestAndLongestString {

    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                words[index++] = word.toString();
                word = new StringBuilder();
            }
        }
        words[index] = word.toString();
        return words;
    }


    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }


    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (int i = 1; i < wordLengths.length; i++) {
            if (Integer.parseInt(wordLengths[i][1]) < findLength(shortest)) {
                shortest = wordLengths[i][0];
            }
            if (Integer.parseInt(wordLengths[i][1]) > findLength(longest)) {
                longest = wordLengths[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        String[] words = splitText(text);

        String[][] wordLengths = getWordsAndLengths(words);

        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
    }
}
