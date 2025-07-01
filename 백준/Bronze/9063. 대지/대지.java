import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;

         int pointNum = Integer.parseInt(br.readLine());
         int [] xPoint = new int [pointNum];
         int [] yPoint = new int [pointNum];
         int x, y;

         for (int i = 0; i < pointNum; i++){
             st = new StringTokenizer(br.readLine());
             xPoint[i] = Integer.parseInt(st.nextToken());
             yPoint[i] = Integer.parseInt(st.nextToken());
         }

         Arrays.sort(xPoint);
         Arrays.sort(yPoint);

        x = xPoint[pointNum-1] - xPoint[0];
        y = yPoint[pointNum-1] - yPoint[0];

         System.out.println( x * y );

     }

}