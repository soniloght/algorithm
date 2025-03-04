import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] s = new String[9];

        for (int i = 0; i < 9; i++) {
            s[i] = br.readLine();
        }

        int [] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(Integer.parseInt(s[i]) == nums[8])
                index = i+1;
        }

        System.out.println(nums[8]);
        System.out.println(index);
    }
}
