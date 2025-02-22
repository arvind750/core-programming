import java.util.Scanner;

public class Reverse_string {
    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
}
