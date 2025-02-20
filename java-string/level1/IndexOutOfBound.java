import java.util.Scanner;

public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.next();


        generateException(text);

        handleException(text);
    }

    public static void generateException(String text) {
        
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }
}
