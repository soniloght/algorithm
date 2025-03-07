import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        StringBuffer sb = new StringBuffer(st.nextToken());
        String r1 = sb.reverse().toString();

        sb = new StringBuffer(st.nextToken());
        String r2 = sb.reverse().toString();

        int n = Integer.parseInt(r1);
        int m = Integer.parseInt(r2);

        System.out.println(n > m ? n : m);

    }
}