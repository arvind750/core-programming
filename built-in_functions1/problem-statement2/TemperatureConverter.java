import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();
        
        System.out.println("Enter temperature:");
        double temperature = scanner.nextDouble();
        
        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

