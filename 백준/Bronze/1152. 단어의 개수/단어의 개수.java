import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        int result = 0;

        s = br.readLine().trim();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                result += 1;
            }
        }

        if(s.length() > 0)
            System.out.print(result + 1);
        else
            System.out.println(result);
    }
}
