import java.util.Scanner;

public class EquationOfLine {

    public static double calculateDistance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       
        return distance;
    }

    public static double[] findEquation(double x1, double y1, double x2, double y2){
        double[] Equation = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double c = y1 - m * x1;
        Equation[0] = m;
        Equation[1] = c;
        return Equation;
    }

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();


        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the two points: " + distance);

        double[] Equation = findEquation(x1, y1, x2, y2);

        System.out.println("Equation of the line: y = " + Equation[0] + "x + " + Equation[1]);

    }
}
