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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int S = A + B;
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + S + "\n");
        }
        bw.close();
    }
}
