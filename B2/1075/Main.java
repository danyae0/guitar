import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        long d = Long.parseLong(br.readLine());

        String end = s.substring(s.length() - 2, s.length());
        int index = 0;
        while (true) {
            if (index < 10) {
                s = s.substring(0, s.length() - 2) + "0" + Integer.toString(index);
                if (Long.parseLong(s) % d == 0) {
                    end = s.substring(s.length() - 2, s.length());
                    bw.write(end);
                    bw.close();
                    break;
                } else {
                    index++;
                }
            } else {
                s = s.substring(0, s.length() - 2) + Integer.toString(index);
                if (Long.parseLong(s) % d == 0) {
                    end = s.substring(s.length() - 2, s.length());
                    bw.write(end);
                    bw.close();
                    break;
                } else {
                    index++;
                }
            }
        }

    }
}