import java.io.*;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s;
         StringTokenizer st;

         s = br.readLine();
         st = new StringTokenizer(s);

         int num = Integer.parseInt(st.nextToken());
         int system = Integer.parseInt(st.nextToken());

         System.out.println(Integer.toString(num,system).toUpperCase());

    }
}