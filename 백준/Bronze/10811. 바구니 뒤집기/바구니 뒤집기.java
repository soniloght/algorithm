import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s = br.readLine();

        Stack<Integer> stack = new Stack<>();

        st= new StringTokenizer(s);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int i, j;
        
        int [] array = new int[n];

        for (int l = 0; l < array.length; l++) {
            array[l] = l + 1;
        }

        for (int k = 0; k < m; k++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            for (int l = i; l <= j ; l++) {
                stack.push(array[l-1]);
            }

            for (int l = i; l <= j ; l++) {
                array[l-1] = stack.pop();
            }
        }

        for(int l :array){
            System.out.print(l + " ");
        }

    }
}