import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) < 65)
                    sb.append(s[i].substring(j, j + 1));
                else if (s[i].charAt(j) < 78)
                    sb.append(Character.toString(s[i].charAt(j) + 13));
                else if (s[i].charAt(j) < 97)
                    sb.append(Character.toString(65 + (s[i].charAt(j) + 13 - 65) % 26));
                else if (s[i].charAt(j) < 110)
                    sb.append(Character.toString(s[i].charAt(j) + 13));
                else
                    sb.append(Character.toString(97 + (s[i].charAt(j) + 13 - 97) % 26));


            }
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.close();
    }
}