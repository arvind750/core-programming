import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        // Taking second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        // Comparing the dates
        if (firstDate.isBefore(secondDate)) { // .isBfore use to check if the date is before the second date
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) { // .isAfter is use to check if it is after second date
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }
}
