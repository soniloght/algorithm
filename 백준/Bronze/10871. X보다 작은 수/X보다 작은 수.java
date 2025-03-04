import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        StringTokenizer st1 = new StringTokenizer(s1);
        StringTokenizer st2 = new StringTokenizer(s2);

        int num = Integer.parseInt(st1.nextToken());
        int compareValue = Integer.parseInt(st1.nextToken());

        String [] array = s2.split(" ");
        String [] result = new String[num];

        for (int i = 0; i < num; i++) {
            if(Integer.parseInt(array[i]) < compareValue)
                result[i] = array[i];
        }

        for (int i = 0; i < result.length; i++) {
            if(result[i] != null)
                System.out.print(result[i] + " ");
        }
    }
}
