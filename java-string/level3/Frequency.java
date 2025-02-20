public class Frequency {

    public static int[] FrequencyArray(String str){

        int[] freq = new int[256];

        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        String text = "Hello";
        int[] freq =  FrequencyArray(text);

        char[][] result = new char[text.length()][2];

        for(int i=0; i<text.length(); i++){
           result[i][0] = text.charAt(i);
           result[i][1] = (char) (freq[text.charAt(i)] + '0');
        }

        for(int i=0; i<text.length(); i++){
            for(int j=0; j<2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}