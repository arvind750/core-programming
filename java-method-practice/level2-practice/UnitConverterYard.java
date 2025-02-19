public class UnitConverterYard {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }

    public static double convertMeterToInch(double meter) {
        return meter * 39.3701;
    }

    public static double convertInchToMeter(double inch) {
        return inch / 39.3701;
    }
    public static double inchTocm(double inch){
        return inch * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("5 feet to yards: " + convertFeetToYards(5));
        System.out.println("5 Meter to Inch: " + convertMeterToInch(5));
        System.out.println("5 Inch to Meter: " + convertInchToMeter(5));
        System.out.println("5 Inch to cm: " + inchTocm(5));
    }
}
