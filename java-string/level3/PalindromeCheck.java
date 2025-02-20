public class PalindromeCheck {
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverse(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static char[] reverse(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }


    public static void main(String[] args) {
        String text = "madam";
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        if (isPalindromeRecursive(text,0,text.length()-1)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
        
        if (isPalindromeCharArray(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    } 
}