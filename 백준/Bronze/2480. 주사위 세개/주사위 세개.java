import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int max = 0;
        int result;


        if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2]) {
            if (a[0] == a[1] && a[1] == a[2]) {
                result = (a[0] * 1000) + 10000;
                System.out.println(result);

            } else if (a[0] == a[1] && a[2] != a[0]) {
                result = (a[0]*100) + 1000;
                System.out.println(result);

            } else if (a[0] == a[2] && a[0] != a[1]){
                result = (a[0]*100) + 1000;
                System.out.println(result);

            }else if (a[1] == a[2] && a[0] != a[1]){
                result = (a[1]*100) + 1000;
                System.out.println(result);

            }

        }

        else if (a[0] != a[1] && a[0] != a[2] && a[1] != a[2]) {
            for (int i = 0; i < 3; i++) {
                if (a[i] > max)
                    max = a[i];
            }
            result = max * 100;
            System.out.println(result);

        }



    }
}