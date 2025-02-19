import java.util.Scanner;
import java.util.Arrays;

class NumberCheckerThree {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = Arrays.copyOf(digits, digits.length);
        for (int i = 0, j = reversed.length - 1; i < j; i++, j--) {
            int temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }


    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }


    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits stored in array: " + Arrays.toString(storeDigits(number)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigits(storeDigits(number))));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
