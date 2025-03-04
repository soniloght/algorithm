import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int hour, minute;

       hour = sc.nextInt();
       minute = sc.nextInt();

       if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){

           if (minute >= 45)
               System.out.println(hour + " " + (minute - 45));
           else if (minute < 45) {
               if (hour == 0)
                   hour = 23;
               else if (hour >= 0)
                   hour -= 1;
               minute += 60;
               System.out.println(hour + " " + (minute - 45));
           }
       }
    }
}