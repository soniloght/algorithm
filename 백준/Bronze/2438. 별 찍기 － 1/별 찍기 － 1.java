import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
