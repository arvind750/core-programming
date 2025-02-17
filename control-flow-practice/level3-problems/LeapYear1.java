import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("The year must be 1582 or later for the Gregorian calendar.");
        }
        
        sc.close();
    }
}
