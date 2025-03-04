import java.io.IOException;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(num % 4 == 0){
            if(4 <= num && num <= 1000){
                for (int i = 0; i < (num/4) ; i++) {
                    System.out.print("long ");
                }
                System.out.print("int");

            }
        }
    }

}