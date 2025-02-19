import java.util.Arrays;
import java.util.Scanner;

public class QuadraticRoots {

    public static double[] findRoots(double a, double b,double delta){
        double[] ans = new double[2];
        
        if(delta>0){
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            ans[0] = root1;
            ans[1] = root2;
            return ans;
        }else if (delta == 0){
            double root1 = -b / (2 * a);
            ans[0] = root1;
            return ans;
        }

        return ans;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation: ");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        
        double delta = b * b - 4 * a * c;

        double[] roots = findRoots(a, b, delta);

        System.out.println("Roots are: "+ Arrays.toString(roots));


        
    }
}