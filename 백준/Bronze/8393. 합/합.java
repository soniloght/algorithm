import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        if(n <= 10000 && n >= 1) {
            for (int i = 0; i <= n; i++) {
                sum += i;

            }
        }
        System.out.println(sum);

    }
}