import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim().toLowerCase();

        int [] array = new int[26];
        int max = -1;
        char result = '?';

        for (int i = 0; i <s.length() ; i++) {
            array[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < array.length; i++) {

            if(array[i] > max){
                max = array[i];
                result = (char)(i+65);
            }
            else if(array[i] == max){
                result = '?';
            }
        }

        System.out.println(result);

    }
}