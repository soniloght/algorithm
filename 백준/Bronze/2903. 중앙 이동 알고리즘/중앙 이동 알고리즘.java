import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int num = Integer.parseInt(br.readLine());

         int result = 3;

         for (int i = 0; i < num-1; i++) {
             result += 2 << i;
         }

         System.out.println(result*result);
         
    }
}
