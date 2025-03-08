import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String [] strings = s.split(" ");

        int [] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            switch (i){
                case 0:
                    array[i] = 1 - array[i];
                    break;
                case 1:
                    array[i] = 1 - array[i];
                    break;
                case 2:
                    array[i] = 2 - array[i];
                    break;
                case 3:
                    array[i] = 2 - array[i];
                    break;
                case 4:
                    array[i] = 2 - array[i];
                    break;
                case 5:
                    array[i] = 8 - array[i];
                    break;
            }
        }

        for(int i : array)
            System.out.print(i + " ");

    }
}