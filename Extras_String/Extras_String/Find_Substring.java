import java.util.Scanner;

public class Find_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter a substring: ");
        String subStr = sc.nextLine();

        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(subStr)) {
                count++;
            }
        }

        System.out.println("Number of occurrences: " + count);
    }
}