import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        String result = "";

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num ; i++) {
                s = br.readLine();
                st = new StringTokenizer(s);

                int repeat = Integer.parseInt(st.nextToken());
                String string = st.nextToken();

            for (int j = 0; j < string.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    result += string.charAt(j);
                }

            }
            result += "\n";
        }
        System.out.println(result);
    }
}