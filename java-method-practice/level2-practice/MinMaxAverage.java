import java.util.Arrays;

public class MinMaxAverage {

    public static int[] generate4DigitRandomArray(int size) {
        int generateDigit = (int) (Math.random() * 9000) + 1000;
        int[] digitArray = new int[size];
        
        int i=size-1;
        while(generateDigit!=0){
            digitArray[i] = generateDigit%10;
            generateDigit /=10;
            i--;
        }

        return digitArray;
        
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum =0;
        int n = numbers.length;
        double[] res = new double[3];
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MIN_VALUE;

        for(int element: numbers){
            res[0] = Math.min(res[0], element);
            res[1] = Math.max(res[1], element);
            sum += element;
        }
        res[2] = sum/n;
    
        return res;

    }


    public static void main(String[] args) {

        int[] randomArray = generate4DigitRandomArray(4);
        double[] averageMinMaxArray = findAverageMinMax(randomArray);

        System.out.println("Random 4 digit Array: "+Arrays.toString(randomArray));

        System.out.println("Minimun: "+ averageMinMaxArray[0]);
        System.out.println("Maximun: "+ averageMinMaxArray[1]);
        System.out.println("Average: "+ averageMinMaxArray[2]);

    }
}
