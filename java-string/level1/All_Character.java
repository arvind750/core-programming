import java.util.Arrays;
import java.util.Scanner;

public class All_Character {

    public static char[] getCharacters(String text) {
        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            array[i] = text.charAt(i);
        }
        return array;
    }

    public static boolean comparison(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = s.nextLine();

        char use[] = getCharacters(text);

        char builtArr[] = text.toCharArray();

        boolean areEqual = comparison(builtArr, use);

        System.out.println("Characters using user-defined method: " + Arrays.toString(use));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtArr));
        System.out.println("Are both character arrays equal: " + areEqual);

    }
}
