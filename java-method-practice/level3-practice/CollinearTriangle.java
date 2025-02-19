import java.util.Scanner;

public class CollinearTriangle {
    
    public static boolean isCollinearSlopeFormula(double x1, double y1, double x2, double y2, double x3, double y3){
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if(slopeAB == slopeBC && slopeBC == slopeAC){
            return true;
        }
        return false;
    }

    public static boolean isCollinearAreaFormula(double x1, double y1, double x2, double y2, double x3, double y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if(area == 0){
            return true;
        }
        return false;
    }


    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the coordinates of the first point: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the coordinates of the second point: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter the coordinates of the third point: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if(isCollinearSlopeFormula(x1, y1, x2, y2, x3, y3)){
            System.out.println("The points are collinear");
        }else{
            System.out.println("The points are not collinear");
        }

        if(isCollinearAreaFormula(x1, y1, x2, y2, x3, y3)){
            System.out.println("The points are collinear");
        }else{
            System.out.println("The points are not collinear");
        }
    }
}
