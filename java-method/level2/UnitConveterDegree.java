public class UnitConveterDegree {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    } 

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    
    public static void main(String[] args) {
        System.out.println("32 Fahrenheit to Celsius: " + convertFarhenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(0));
        System.out.println("10 Pounds to Kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 Kilograms to Pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("10 Liters to Gallons: " + convertLitersToGallons(10));
    }
}
