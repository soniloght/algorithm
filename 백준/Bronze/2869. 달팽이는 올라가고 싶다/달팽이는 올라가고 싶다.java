import java.io.*;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String s;
         StringTokenizer st;

         st = new StringTokenizer(s = br.readLine());
         int up = Integer.parseInt(st.nextToken());
         int down = Integer.parseInt(st.nextToken());
         int goal = Integer.parseInt(st.nextToken());

         int day = (goal - down) / (up - down);
         if((goal-down) % (up - down) != 0)
             day++;

         System.out.println(day);
     }
}
