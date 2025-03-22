import java.io.*;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s;
         StringTokenizer st;

         boolean [][] xy = new boolean[101][101];

         int area = 0;
         int x = 0;
         int y = 0;

         int num = Integer.parseInt(br.readLine());

         for (int i = 0; i < num; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);
             x = Integer.parseInt(st.nextToken());
             y = Integer.parseInt(st.nextToken());

             for (int j = x; j < x + 10; j++) {
                 for (int k = y; k < y + 10; k++) {
                     if(!xy[j][k]){
                         xy[j][k] = true;
                         area++;
                     }
                 }
             }
         }

         System.out.println(area);


    }

}