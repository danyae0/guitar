import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2)
                    if (s.charAt(j) == 'F')
                        sum += 1;
            } else {
                for (int j = 1; j < 8; j += 2)
                    if (s.charAt(j) == 'F')
                        sum += 1;
            }


        }

        bw.write(sum + "");
        bw.close();
    }
}