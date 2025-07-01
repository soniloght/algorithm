import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int [] angle = new int[3];
         int sumAngle = 0;

         for (int i = 0; i < 3; i++) {
             angle[i] = Integer.parseInt(br.readLine());
         }
         sumAngle = angle[0] + angle[1] + angle[2];

         if(sumAngle == 180){
             if (angle[0] == angle[1] && angle[1] == angle[2]){
                 System.out.println("Equilateral");
             }
             else if(angle[0] == angle[1] || angle[1] == angle[2] || angle[0] == angle[2]){
                 System.out.println("Isosceles");
             }
             if (angle[0] != angle[1] && angle[1] != angle[2] && angle[0] != angle[2]){
                 System.out.println("Scalene");
             }
         }
         else
             System.out.println("Error");
     }

}