import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.nextLine(); 
        System.out.println("Is the text in lowercase? " + compareStrings(text.toLowerCase(), convertToLowerCase(text)));
    }

    public static String convertToLowerCase(String text) {
        String result = ""; 
        for (int i = 0; i < text.length(); i++) {
           
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                
                result += (char) (text.charAt(i) + 32);
            } else {

                result += text.charAt(i);
            }
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
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
}
