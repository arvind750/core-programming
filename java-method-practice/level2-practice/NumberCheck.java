public class NumberCheck {

    public static boolean isPositive(int n) {
        return n > 0 ? true : false;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public static int compare(int n, int m) {
        if (n > m)
            return 1;
        if (n < m)
            return -1;
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 2, -3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is positive and even");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }

        if (compare(arr[0], arr[arr.length - 1]) == 1) {
            System.out.println(arr[0] + " is greater than " + arr[arr.length - 1]);
        } else if (compare(arr[0], arr[arr.length - 1]) == 0) {
            System.out.println("equal");

        } else {
            System.out.println(arr[0] + " is less than " + arr[arr.length - 1]);

        }

    }
}
