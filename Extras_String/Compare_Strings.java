import java.util.Scanner;

public class Compare_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
