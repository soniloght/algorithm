import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int [] coins = {25, 10, 5, 1};
         int money = 0;
         int count = 0;

         int num  = Integer.parseInt(br.readLine());

         String [] result = new String[num];

         for (int i = 0; i < result.length; i++) {
             result[i] = "";
         }

         for (int i = 0; i < num; i++) {

             money = Integer.parseInt(br.readLine());

             for (int j = 0; j < coins.length; j++) {
                 count = money / coins[j];
                 money %= coins[j];
                 result[i] += count + " ";
             }
         }

         for(String s : result){
             System.out.println(s.trim());
         }

    }
}
