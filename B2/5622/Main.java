import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int time = 0;

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a < 80)
                time += (a - 62) / 3;
            else {
                if (a >= 80 && a <= 83)
                    time += 6;
                else if (a >= 87)
                    time += 8;
                else time += 7;
            }

        }

        time += s.length() * 2;

        bw.write(time + "");
        bw.close();
    }
}