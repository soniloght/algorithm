import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int num = Integer.parseInt(br.readLine());

         int count = 1;

         int range1 = 1;
         int range2 = 1;

         while(true){

             if(num == 1)
                 break;

             if(count > 1)
                 range1 += 6 * (count - 1);
             else if(count == 1)
                 range1 += 1;
             range2 += 6 * count;

             count++;

             if(num >= range1 && num <= range2){
                 break;
             }
         }

         System.out.println(count);
    }
}