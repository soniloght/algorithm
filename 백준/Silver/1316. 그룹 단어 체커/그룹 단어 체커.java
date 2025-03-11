import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     public static void main(String[] args) throws IOException {

        int count = 0;
        boolean group = false;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            if(check() == true){
                count++;
            }
        }

        System.out.print(count);

    }

    private static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        int current;

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);

            if (prev != current) {
                if (check[current - 'a'] == false) {
                    check[current - 'a'] = true;
                    prev = current;
                } else {
                    return false;
                }
            }

        }
        return true;
     }
}
