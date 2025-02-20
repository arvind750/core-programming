import java.util.Scanner;

public class ArrayIndexoutofbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        generateException(names);

        handleException(names);
    }

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }


    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
