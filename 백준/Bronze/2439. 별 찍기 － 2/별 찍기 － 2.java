import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= a ; i++){
            for(int l = 1 ; l <= a-i ; l++)
                System.out.print(" ");
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
