import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        StringTokenizer st1 = new StringTokenizer(s1);

        int num = Integer.parseInt(st1.nextToken());

        String [] array = s2.split(" ");

        int [] nums = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[num-1]);

    }
}