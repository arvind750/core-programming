import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter new word: ");
        String newWord = scanner.next();
        System.out.println("Updated sentence: " + replaceWord(sentence, oldWord, newWord));
        scanner.close();
    }
}