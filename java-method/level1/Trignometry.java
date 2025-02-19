import java.util.Scanner;

public class Trignometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        
        double[] result = new double[3];
        double radians = Math.toRadians(angle);

        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

    }
}
