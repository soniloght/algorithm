import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<Integer>();
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = Integer.parseInt(br.readLine())%42;
            set.add(result);
        }

        System.out.println(set.size());
        
    }
}
