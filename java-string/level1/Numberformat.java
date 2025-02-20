import java.util.Scanner;

public class Numberformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
