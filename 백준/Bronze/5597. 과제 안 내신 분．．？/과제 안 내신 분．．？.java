import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[30];
        int [] inputNum = new int[30];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            inputNum[i] = Integer.parseInt(br.readLine());
        }
        inputNum[29] = 31;
        inputNum[28] = 31;
        Arrays.sort(inputNum);
        

        for (int i = 0, l = 0; i < num.length; i++) {

            if(num[i] == inputNum[l]){
                l++;
            }
            else if(num[i] != inputNum[l]) {
                System.out.println(num[i]);
            }
        }
    }
}
