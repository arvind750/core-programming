import java.util.Scanner;

public class ChocolateDistribution {
    
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates / numberOfChildren;
        result[1] = numberOfChocolates % numberOfChildren;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println(
                "Each child gets " + result[0] + " chocolates and " + result[1] + " chocolates are remaining.");


    }
}
