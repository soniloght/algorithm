import java.io.IOException;
import java.util.*;


class Main {
    private static int sum, num, result;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        sum = input.nextInt();
        num = input.nextInt();

        for (int i = 0; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(input.nextLine());
            if(st.hasMoreTokens()){
                int s1 = Integer.parseInt(st.nextToken());
                int s2 = Integer.parseInt(st.nextToken());
                result += s1 * s2;
            }
        }

        if(sum == result){
            System.out.println("Yes");
        }else
            System.out.println("No");


    }
}