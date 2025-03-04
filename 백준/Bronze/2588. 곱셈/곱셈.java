import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, a = 0, b;
        A = sc.nextInt();
        B = sc.nextInt();
        b = B;

        for (int i = 0; i < 3 ; i++) {
            a = B % 10;
            B /= 10;
            System.out.println(A*a);
        }
        B = b;
        System.out.println(A*B);

    }
}