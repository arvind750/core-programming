import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.4516;
        System.out.println("The area of the triangle is " + areaCm2 + " cm² and " + areaInches2 + " inches²");
        input.close();
    }
}
