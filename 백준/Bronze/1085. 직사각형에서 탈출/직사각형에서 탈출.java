import java.io.*;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         String s = br.readLine();
         st = new StringTokenizer(s);

         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         int w = Integer.parseInt(st.nextToken());
         int h = Integer.parseInt(st.nextToken());

         int dis1 = Math.min(w-x, h-y);
         int dis2 = Math.min(x, y);
         int result = Math.min(dis1, dis2);

         System.out.println(result);

     }
}