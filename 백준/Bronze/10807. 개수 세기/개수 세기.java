import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int aryNum = Integer.parseInt(br.readLine());
        int v = 0;
        
        String s = br.readLine();
        String [] ary = s.split(" ");
        String Num = br.readLine();

        for (int i = 0; i < aryNum ; i++) {
            if(Integer.parseInt(ary[i]) == Integer.parseInt(Num)) v++;
        }
        System.out.println(v);
    }
}