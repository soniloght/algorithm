import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int x = Integer.parseInt(br.readLine());

         int count = 1;

         int num = 0;

        while(true){

            if(x <= num + count){
                if(count % 2 == 1){
                    System.out.println((count - (x - num - 1)) + "/" + (x - num));
                    break;
                }else{
                    System.out.println((x - num) + "/" + (count -(x - num - 1)));
                    break;
                }
            }else{
                num += count;
                count++;
            }
        }
        
     }
}
