import java.io.*;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String s;
         StringTokenizer st;

         st = new StringTokenizer(s = br.readLine());

         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());

         int count = 0;
         int result = 0;

         for (int i = 1; i <= N; i++) {
             if(N % i == 0){
                 count++;
                 if(K == count) {
                     result = i;
                     break;
                 }
             }
         }

         System.out.println(result);

     }
}