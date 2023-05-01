import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int realx = Integer.parseInt(s[0]);
        int realy = Integer.parseInt(s[1]);
        int y = Integer.parseInt(s[1]);
        int tmp = 0;

        if (y >= x) {
            tmp = x;
            x = y;
            y = tmp;
        }

        while (x % y != 0) {
            tmp = y;
            y = x % y;
            x = tmp;
        }

        bw.write(y + "\n" + realx * realy / y);
        bw.close();
    }
}