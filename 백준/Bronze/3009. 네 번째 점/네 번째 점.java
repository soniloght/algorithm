import java.io.*;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         String s;
         int [] x = new int[3];
         int [] y = new int[3];


         for (int i = 0; i < 3; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);
             x[i] = Integer.parseInt(st.nextToken());
             y[i] = Integer.parseInt(st.nextToken());
         }

         if(x[0] == x[1])
             System.out.print(x[2] + " ");
         else if(x[1] == x[2])
             System.out.print(x[0] + " ");
         else
             System.out.print(x[1] + " ");

         if(y[0] == y[1])
             System.out.print(y[2]);
         else if(y[1] == y[2])
             System.out.print(y[0]);
         else
             System.out.print(y[1]);
     }
}