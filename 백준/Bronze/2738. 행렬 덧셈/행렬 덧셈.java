import java.io.*;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         String s = br.readLine();
         st = new StringTokenizer(s);

         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());

         int [][] A = new int[N][M];
         int [][] B = new int[N][M];
         int [][] R = new int[N][M];

         for (int i = 0; i < N; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);
             for (int j = 0; j < M; j++) {
                 A[i][j] = Integer.parseInt(st.nextToken());
             }
         }
         for (int i = 0; i < N; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);
             for (int j = 0; j < M; j++) {
                 B[i][j] = Integer.parseInt(st.nextToken());
             }
         }
         for (int i = 0; i < N; i++) {
             for (int j = 0; j < M; j++) {
                 R[i][j] = A[i][j] + B[i][j];
             }
         }

         for (int i = 0; i < N; i++) {
             for (int j = 0; j < M; j++) {
                 System.out.print(R[i][j] + " ");
             }
             System.out.println();

         }

    }

}