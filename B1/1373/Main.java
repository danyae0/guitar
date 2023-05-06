import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String first = "";

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        if (s.length() % 3 != 0) {
            first += (s.substring(0, s.length() % 3));


            for (int i = 0; i < s.length() % 3; i++) {
                sum += (Integer.parseInt(first.substring(s.length() % 3 - i - 1, s.length() % 3 - i)) * (int) Math.pow(2, i));
            }

            sb.append(sum);



        }


        s = s.substring(s.length() % 3, s.length());

        sum = 0;

        for (int i = 0; i < s.length() / 3; i++) {
            for (int j = 3 * i; j < 3 * i + 3; j++) {
                sum += (Integer.parseInt(s.substring(j, j + 1)) * (int) Math.pow(2, 3 * i + 2 - j));

            }
            sb.append(sum);
            sum = 0;
        }

        bw.write(sb.toString());
        bw.close();
    }
}