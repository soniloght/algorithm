import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int userInputSize = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1 ; i <= userInputSize ; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + S + "\n");
        }
        bw.close();
    }
}
