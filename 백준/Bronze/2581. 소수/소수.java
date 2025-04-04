import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int M = Integer.parseInt(br.readLine());
         int N = Integer.parseInt(br.readLine());
         int count = 0;
         int sum = 0;
         int min = 0;

         for (int i = M; i <= N; i++) {
             for (int j = 1; j <= i; j++) {
                 if(i%j == 0) {
                     count++;
                 }
             }
             if(count == 2){
                 sum += i;
                 if(min == 0)
                     min = i;
             }
             count = 0;
         }

         if(min != 0){
             System.out.println(sum);
             System.out.println(min);
         }else
             System.out.println("-1");

     }
}