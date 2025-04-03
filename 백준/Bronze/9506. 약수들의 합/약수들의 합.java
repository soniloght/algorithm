import java.io.*;
import java.util.ArrayList;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> num2;
         String s;
         int num = 0;
         int sum;

         while(!(s = br.readLine()).equals("-1")){
             num = Integer.parseInt(s);
             list.add(num);
         }

         for (int i = 0; i < list.size(); i++) {
             num = list.get(i);
             num2 = new ArrayList<>();
             sum = 0;
             for (int j = 1; j < num; j++) {
                 if(num % j == 0){
                     sum += j;
                     num2.add(j);
                 }
             }
             if(num == sum){
                 System.out.print(num + " =");
                 for (int j = 0; j < num2.size(); j++) {
                     System.out.print(" "+ num2.get(j));
                     if(j != num2.size()-1){
                         System.out.print(" " + "+");
                     }
                 }
                 System.out.println();
             }else
                 System.out.println(num + " is NOT perfect.");
         }

     }
}
