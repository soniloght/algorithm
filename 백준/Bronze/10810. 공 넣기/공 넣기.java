import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();

        StringTokenizer st = new StringTokenizer(nm);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] buket = new int[n];

        for (int a = 0; a < m ; a++) {

            String s = br.readLine();
            st = new StringTokenizer(s);

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int l = i ; l <= j ; l++) {
                buket[l-1] = k;
            }

        }

        for (int i :buket) {
            System.out.print(i + " ");
        }

    }
}