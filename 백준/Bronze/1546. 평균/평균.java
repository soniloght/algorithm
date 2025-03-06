import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;

        int num = Integer.parseInt(br.readLine());

        double [] score = new double[num];
        double max = 0;
        double sum = 0;
        double result = 0;

        s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < num; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(score);
        max = score[num-1];

        for (int i = 0; i <  num; i++) {
            score[i] = score[i] / max * 100.0;
            sum += score[i];
        }
        result = sum / (double)num;
        System.out.println(result);

    }
}