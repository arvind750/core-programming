import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Take the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        
        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];  
        String[] weightStatus = new String[number];  
        
        // Take input for weight and height, and calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double height = -1, weight = -1;
            
            // Input height for each person, ensure it is positive
            while (height <= 0) {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            }
            
            // Input weight for each person, ensure it is positive
            while (weight <= 0) {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            }
            
            // Store height and weight in the 2D array
            personData[i][0] = height;
            personData[i][1] = weight;
            
            // Calculate BMI: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;  // Store BMI
            
            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Details:");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.printf("Height: %.2f meters\n", personData[i][0]);
            System.out.printf("Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println("---------------------------------------------------------");
        }
    }
}
