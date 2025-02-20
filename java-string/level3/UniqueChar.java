import java.util.Arrays;

public class UniqueChar {
    
    public static int findLength(String text){
        int count=0;
        for(char ch: text.toCharArray()){
            count++;
        }

        return count;
    }

    
    public static char[] findUnique(String text){

        int n = findLength(text);

        char[] result = new char[n];
        int k=0;

        for(int i=0; i<n; i++){
            char currchar = text.charAt(i);
            boolean isUnique = true;

            for(int j=0; j<n; j++){
                if(result[j] == currchar){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                result[k++] = currchar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "hello";
        System.out.println(Arrays.toString(findUnique(text)));
    }
}
