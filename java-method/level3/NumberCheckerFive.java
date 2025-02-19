import java.util.*;

public class NumberCheckerFive {

    public static int[] findFactors(int number) {
        int[] factors = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }


    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            if(factor == 0) {
                break;
            }
            product *= factor;
        }
        return product;
    }

    public static int findProductOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            if(factor == 0) {
                break;
            }
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum == 2 * number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum > 2 * number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum < 2 * number;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = NumberChecker.storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += findFactorial(digit);
        }
        return sum == number;
    }

    public static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

    }
}
