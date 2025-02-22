import java.util.Scanner;

public class Toggle_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch); 
            }
            else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch); 
            }
            else {
                result += ch;
            }
        }

        // Print the modified string with toggled case
        System.out.println("Toggled string: " + result);
    }
}