import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());
        int count = 2*input-1;

        for (int i = 0; i < input; i++) {
                for (int j = 1; j < input-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i*2+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }

        for (int i = input-1; i >0; i--) {
            for (int j = input-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i*2-1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}