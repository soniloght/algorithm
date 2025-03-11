import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s;

         char [][] ch = new char[5][15];

         int l = 0;

         for (int i = 0; i < 5; i++) {
             s = br.readLine();
             if(l <= s.length()){
                 l = s.length();
             }

             for (int j = 0; j < s.length(); j++) {
                 ch[i][j] = s.charAt(j);
             }
         }

         for (int j = 0; j < l; j++) {
             for (int i = 0; i < 5; i++) {
                 if(ch[i][j] == '\u0000'){
                     continue;
                 }else if(ch[i][j] != '\u0000')
                     System.out.print(ch[i][j]);
             }
         }

    }

}