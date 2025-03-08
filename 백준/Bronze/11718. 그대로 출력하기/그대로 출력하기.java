import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int index = 0;

        String [] strings = new String[100];

        while((s = br.readLine()) != null && !s.isEmpty()){
            strings[index] = s;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(strings[i]);
        }
    }
}