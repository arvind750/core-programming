import java.util.Scanner;

public class Illegal_argu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the text: ");
        String text = sc.next();
        generateException(text);

        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}