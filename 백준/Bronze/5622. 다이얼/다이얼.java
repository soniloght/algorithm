import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char [] s = br.readLine().toCharArray();
        int result = 0;

        for (int i = 0; i < s.length; i++) {
            if(s[i] == 'A' || s[i] == 'B' || s[i] == 'C')
                result += 3;
            else if(s[i] == 'D' || s[i] == 'E' || s[i] == 'F')
                result += 4;
            else if(s[i] == 'G' || s[i] == 'H' || s[i] == 'I')
                result += 5;
            else if(s[i] == 'J' || s[i] == 'K' || s[i] == 'L')
                result += 6;
            else if(s[i] == 'M' || s[i] == 'N' || s[i] == 'O')
                result += 7;
            else if(s[i] == 'P' || s[i] == 'Q' || s[i] == 'R' || s[i] == 'S')
                result += 8;
            else if(s[i] == 'T' || s[i] == 'U' || s[i] == 'V')
                result += 9;
            else if(s[i] == 'W' || s[i] == 'X' || s[i] == 'Y' || s[i] == 'Z')
                result += 10;
        }

        System.out.println(result);
    }
}