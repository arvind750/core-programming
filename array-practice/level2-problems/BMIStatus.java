import java.util.Scanner;  

public class BMIStatus { 
    // Function to calculate BMI  
    private static double calculateBMI(double weight, double height) {  
        return weight / (height * height);  
    }  

    // Function to determine weight status  
    private static String determineWeightStatus(double bmi) {  
        if (bmi <= 18.4) return "Underweight";  
        else if (bmi <= 24.9) return "Normal";  
        else if (bmi <= 39.9) return "Overweight";  
        else return "Obese";  
    }  

    // Function to get valid weight input  
    private static double getValidWeight(Scanner scanner) {  
        double weight;  
        while (true) {  
            weight = scanner.nextDouble();  
            if (weight <= 0) {   
                System.out.print("Please enter a positive value for weight: ");   
            } else {  
                break;  
            }  
        }  
        return weight;  
    }  

    // Function to get valid height input  
    private static double getValidHeight(Scanner scanner) {  
        double height;  
        while (true) {  
            height = scanner.nextDouble();  
            if (height <= 0) {   
                System.out.print("Please enter a positive value for height: ");   
            } else {  
                break;  
            }  
        }  
        return height;  
    } 

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Taking input for the number of persons  
        System.out.print("Enter the number of persons: ");  
        int numPersons = scanner.nextInt();  

        // Arrays to store weight, height, BMI, and weight status  
        double[] weights = new double[numPersons];  
        double[] heights = new double[numPersons];  
        double[] bmis = new double[numPersons];  
        String[] weightStatuses = new String[numPersons];  

        // Input for weight and height  
        for (int i = 0; i < numPersons; i++) {  
            System.out.println("Enter details for person " + (i + 1) + ":");  
            System.out.print("Weight (kg): ");  
            weights[i] = getValidWeight(scanner);  
            System.out.print("Height (m): ");  
            heights[i] = getValidHeight(scanner);  
            
            // Calculate BMI  
            bmis[i] = calculateBMI(weights[i], heights[i]);  
            // Determine weight status  
            weightStatuses[i] = determineWeightStatus(bmis[i]);  
        }  

        // Displaying the results  
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Person", "Weight", "Height", "BMI", "Status");  
        for (int i = 0; i < numPersons; i++) {  
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s\n",   
                (i + 1), weights[i], heights[i], bmis[i], weightStatuses[i]);  
        }   
    }  

      
}