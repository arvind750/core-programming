import java.util.Scanner;

public class Frequent_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++; // Increment the count for each character in the frequency array
        }

        int max = -1; 
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)]; // Update max frequency
                result = str.charAt(i); // Update the result character
            }
        }

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
