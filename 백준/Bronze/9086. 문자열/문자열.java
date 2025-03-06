import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        char a, b;

        int num = Integer.parseInt(br.readLine());

        String [] result = new String[num];

        for (int i = 0; i < num; i++) {
            s = br.readLine();
            result[i] = String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length()-1));
        }

        for(String i: result){
            System.out.println(i);
        }

    }
}