import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         HashMap<String,Double> map = new HashMap<String, Double>();
         map.put("A+", 4.5);
         map.put("A0", 4.0);
         map.put("B+", 3.5);
         map.put("B0", 3.0);
         map.put("C+", 2.5);
         map.put("C0", 2.0);
         map.put("D+", 1.5);
         map.put("D0", 1.0);
         map.put("F", 0.0);
         map.put("P", -1.0);

         String s;
         StringTokenizer st;

         double sum = 0.0;

         double rating = 0.0;
         double score = 0.0;
         double sumScore = 0.0;

         for (int i = 0; i < 20; i++) {
             s = br.readLine();
             st = new StringTokenizer(s);
             st.nextToken();
             score = Double.parseDouble(st.nextToken());
             rating = map.get(st.nextToken());

             if(rating == -1.0){
                 continue;
             }else {
                 sum += score * rating;
                 sumScore += score;
             }
         }
         System.out.printf("%.6f",sum/sumScore);
    }

}