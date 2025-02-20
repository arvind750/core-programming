public class UniqueFrequency {
    public static int findLength(String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            count++;
        }
        return count;
    }

    public static char[] findUnique(String text) {
        int n = findLength(text);
        char[] result = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char currchar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (result[j] == currchar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[k++] = currchar;
            }
        }

        return result;
    }

    public static int[] FrequencyArray(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        String text = "Hello";

        int[] freqArray = FrequencyArray(text);
        char[] uniqueChar = findUnique(text);

        char[][] result = new char[uniqueChar.length][2];

        for (int i = 0; i < uniqueChar.length; i++) {
            if (uniqueChar[i] == 0) {
                continue;
            }
            result[i][0] = uniqueChar[i];
            result[i][1] = (char) (freqArray[uniqueChar[i]] + '0');
        }

        for (int i = 0; i < uniqueChar.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
