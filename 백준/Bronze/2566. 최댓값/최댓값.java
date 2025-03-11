import java.io.*;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         String s;
         int [][] grid = new int[9][9];
         int [] maxArray = new int[9];
         int [] maxCol = new int[9];
         int max = 0;
         int col = 0;
         int row = 0;

         for (int i = 0; i < grid.length; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);

             for (int j = 0; j < grid.length; j++) {
                 grid[i][j] = Integer.parseInt(st.nextToken());
             }
         }

         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < maxArray.length; j++) {
                 if(maxArray[i] <= grid[i][j]){
                     maxArray[i] = grid[i][j];
                     maxCol[i] = j+1;
                 }
             }
         }

         for (int i = 0; i < maxArray.length; i++) {
             if(max <= maxArray[i]){
                 max = maxArray[i];
                 row = i + 1;
                 col = maxCol[i];
             }
         }
         System.out.println(max);
         System.out.print(row + " " + col);



    }

}