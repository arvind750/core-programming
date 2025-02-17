import java.util.Scanner;
public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        System.out.println("Mean height of the team: " + (sum / 11));
        scanner.close();
    }
}
