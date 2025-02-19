import java.util.Scanner;

public class YoungestFriend {
    
    public static String findYoungest(int[] ages) {
        int min = ages[0];
        String name = "Amar";
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                if (i == 1) name = "Akbar";
                else name = "Anthony";
            }
        }
        return name;
    }

    public static String findTallest(int[] heights) {
        int max = heights[0];
        String name = "Amar";
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                if (i == 1) name = "Akbar";
                else name = "Anthony";
            }
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("The youngest friend is: " + findYoungest(ages));
        System.out.println("The tallest friend is: " + findTallest(heights));
    }
}
