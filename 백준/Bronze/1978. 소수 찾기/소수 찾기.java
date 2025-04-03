import java.io.*;
import java.util.StringTokenizer;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         int num = Integer.parseInt(br.readLine());
         int [] nums = new int[num];
         int rcount = 0;
         int count = 0;

         String s = br.readLine();
         st = new StringTokenizer(s);

         for (int i = 0; i < num; i++) {
             nums[i] = Integer.parseInt(st.nextToken());
             for (int j = 1; j <= nums[i]; j++) {
                 if(nums[i]%j == 0)
                     count++;
             }
             if(count == 2){
                 rcount++;
             }
             count = 0;
         }
         System.out.println(rcount);
     }
}