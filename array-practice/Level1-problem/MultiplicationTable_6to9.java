import java.util.Scanner;
public class MultiplicationTable_6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 6; i <= 9; i++) System.out.println(number + " * " + i + " = " + (number * i));
        scanner.close();
    }
}
