import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] result = new int[26];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(j)) == ('a' + i)) {
                    result[i] = s.indexOf('a' + i);
                    break;
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}