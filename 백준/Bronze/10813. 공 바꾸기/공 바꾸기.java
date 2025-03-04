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
        int buffer = 0;

        for (int i = 0 ; i < n ; i++) {
            buket[i] = i+1;
        }

        for (int a = 0; a < m ; a++) {

            String s = br.readLine();
            st = new StringTokenizer(s);

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            buffer = buket[i-1];
            buket[i-1] = buket[j-1];
            buket[j-1] = buffer;
        }

        for (int i :buket) {
            System.out.print(i + " ");
        }

    }
}
