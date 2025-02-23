import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input string
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();
        
        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        
        // Displaying the result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Normalize the string
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
