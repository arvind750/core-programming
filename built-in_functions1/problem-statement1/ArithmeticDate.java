import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ArithmeticDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking date input from user
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // parsing input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);

        // performing date arithmetic
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // displaying the result
        System.out.println("Final date after calculations: " + newDate);

        sc.close();
    }
}
