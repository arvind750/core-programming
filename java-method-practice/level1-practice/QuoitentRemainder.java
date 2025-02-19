import java.util.Scanner;

public class QuoitentRemainder {
    public static int[] findQuotientRemainder(int dividend, int divisor) {
        int[] result = new int[2];
        result[0] = dividend / divisor; // Quotient
        result[1] = dividend % divisor; // Remainder
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter dividend and divisor: ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findQuotientRemainder(dividend, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);

    }   
}
