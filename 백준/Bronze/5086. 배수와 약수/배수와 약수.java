import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s;
         ArrayList<String> strings = new ArrayList<>();
         StringTokenizer st;
         int count = 0;
         int num1 = 0;
         int num2 = 0;

         while((s = br.readLine()) != null && !s.isEmpty()){

             st = new StringTokenizer(s);

             num1 = Integer.parseInt(st.nextToken());
             num2 = Integer.parseInt(st.nextToken());

             if(num1 == 0 && num2 == 0){
                 break;
             }
             if(num2%num1 == 0 && num1 < num2){
                 strings.add(count,"factor");

             } else if (num1%num2 == 0 && num1 > num2) {
                 strings.add(count,"multiple");
             }else
                 strings.add(count,"neither");
             count++;
         }

         for (int i = 0; i < strings.size(); i++) {
             System.out.println(strings.get(i));
         }
         
    }
}